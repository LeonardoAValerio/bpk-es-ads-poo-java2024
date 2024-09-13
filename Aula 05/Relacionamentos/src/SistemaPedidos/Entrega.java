package SistemaPedidos;

public class Entrega {
    private Funcionario entregador;
    private Endereco enderecoEntrega;
    private Double taxaDeEntrega;

    public Entrega(Funcionario entregador, Endereco enderecoEntrega, Double taxaDeEntrega) {
        this.entregador = entregador;
        this.enderecoEntrega = enderecoEntrega;
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public Funcionario getEntregador() {
        return entregador;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public Double getTaxaDeEntrega() {
        return taxaDeEntrega;
    }

    @Override
    public String toString() {
        return "Entregador: " + entregador +
                ", Endereco: " + enderecoEntrega +
                ", Taxa: R$" + taxaDeEntrega;
    }
}
