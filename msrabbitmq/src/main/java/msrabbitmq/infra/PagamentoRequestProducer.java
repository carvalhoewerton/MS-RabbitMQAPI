package msrabbitmq.infra;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import msrabbitmq.model.PagamentoDto;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PagamentoRequestProducer {
    @Autowired
    private AmqpTemplate amqpTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();
    public void integrar(PagamentoDto pagamento) throws JsonProcessingException {
        String jsonPayload = objectMapper.writeValueAsString(pagamento);
        System.out.println("JSON Payload: " + jsonPayload);

        amqpTemplate.convertAndSend(
                "pagamento-request-exchange",
                "pagamento-request-rout-key",
                jsonPayload);
    }

}
