package aws.cloud.sqs.Controller;

import aws.cloud.sqs.Entity.Result;
import aws.cloud.sqs.Entity.User;
import aws.cloud.sqs.Service.ServiceSQS;
import aws.cloud.sqs.Validator.Validator1;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private ServiceSQS serviceSQS;

    @Autowired
    private ObjectMapper objectMapper;

    public static final String topic = "requestQueue";

    @GetMapping
    public String GetHome(Model model) throws IOException {
        model.addAttribute(new User());
        if (!StringUtils.isEmpty(ServiceSQS.msg)) {
            Result result = objectMapper.readValue(ServiceSQS.msg, Result.class);
            model.addAttribute("mess", result);
        }
        return "home";
    }

    @PostMapping
    public String PostHome(@ModelAttribute @Valid User user, BindingResult bindingResult, Model model) throws IOException {

        if (bindingResult.hasErrors()) {
            Map<String, String> errorsMap = Validator1.getErrors(bindingResult);
            model.mergeAttributes(errorsMap);
        } else {
            serviceSQS.send(topic, objectMapper.writeValueAsString(user));
        }
        if (!StringUtils.isEmpty(ServiceSQS.msg)) {
            Result result = objectMapper.readValue(ServiceSQS.msg, Result.class);
            model.addAttribute("mess", result);
        }
        return "home";
    }


}
