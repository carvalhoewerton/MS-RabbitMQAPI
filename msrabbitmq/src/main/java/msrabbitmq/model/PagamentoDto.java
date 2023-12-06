package msrabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class PagamentoDto implements Serializable {
    private String numeroPedido;
    private BigDecimal valor;
    private String produto;

    public PagamentoDto(String numeroPedido, BigDecimal valor, String produto) {
        this.numeroPedido = numeroPedido;
        this.valor = valor;
        this.produto = produto;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
