package aws.ec2.sqs.Service;

import aws.ec2.sqs.Entity.Result;
import aws.ec2.sqs.Entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ServiceSQS {

    public static final String topic = "responseQueue";

    @Autowired
    QueueMessagingTemplate messagingTemplate;

    public void send(String topicName, Object message) {
        messagingTemplate.convertAndSend(topicName, message);
    }



    @SqsListener("requestQueue")
    public void receiveMessage(String message, @Header("SenderId") String senderId) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(message, User.class);
        Result result = new Result();
        result.setName(user.getName());
        result.setAvg(user.getAVG());
        result.setSum(user.getSum());

        send(topic, objectMapper.writeValueAsString(result));

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
        System.out.println(message);
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
    }

}
