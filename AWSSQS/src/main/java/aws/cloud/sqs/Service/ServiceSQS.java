package aws.cloud.sqs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class ServiceSQS {

    public static String msg = "";


    @Autowired
    QueueMessagingTemplate messagingTemplate;

    public void send(String topicName, Object message) {
        messagingTemplate.convertAndSend(topicName, message);
    }



    @SqsListener("responseQueue")
    public void receiveMessage(String message, @Header("SenderId") String senderId) {
        System.out.println(message);
        msg = message;
    }

}
