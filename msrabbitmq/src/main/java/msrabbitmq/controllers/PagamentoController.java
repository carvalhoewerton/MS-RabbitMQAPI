package msrabbitmq.controllers;

import msrabbitmq.model.PagamentoDto;
import msrabbitmq.service.PagamentoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    @Autowired
    private PagamentoFacade service;
    @PostMapping
    public String processar(@RequestBody PagamentoDto pagamento){

        return service.solicitarPagamento(pagamento);
    }

}
