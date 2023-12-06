package msrabbitmq.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import msrabbitmq.infra.PagamentoRequestProducer;
import msrabbitmq.model.PagamentoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoFacade {
    @Autowired
    private PagamentoRequestProducer producer;

    public String solicitarPagamento(PagamentoDto pagamentoDto) {
        try {
            producer.integrar(pagamentoDto);
        } catch (JsonProcessingException e) {
            return "Ocorreu um erro" + e.getMessage();

        }
        return "Processando a requisição";
    }
}
