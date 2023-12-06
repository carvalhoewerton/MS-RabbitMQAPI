package rabbitmqlistener;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PublicRequestConsumidor {

    @RabbitListener(queues = {"pagamento-request-queue"})
    public void receberMensagem(String payload) {
        System.out.println("Mensagem recebida: " + payload);
    }
}