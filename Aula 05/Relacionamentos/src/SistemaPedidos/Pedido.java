package SistemaPedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Double valorPedido;
    private Cliente cliente;
    private List<Item> items;
    private Integer ID;
    private Entrega entrega;
    private MetodosPagamento metodosPagamento;


    public Pedido(Cliente cliente, Integer ID, MetodosPagamento mp) {
        this.cliente = cliente;
        this.metodosPagamento = mp;
        this.ID = ID;
        valorPedido = 0.0;
        items = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        items.add(item);
        valorPedido += item.getSubTotal();
    }

    public void removerItem(Item item) {
        items.remove(item);
        valorPedido -= item.getSubTotal();
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setEntrega(Funcionario entregador, Double taxaDeEntrega) {
        entrega = new Entrega(entregador, cliente.getEnderecoAutual(), taxaDeEntrega);
    }

    public String printItems() {
        String items = "\n";
        for(Item item : this.items) {
            items += item + "\n";
        }
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido: " + ID + "\n");
        sb.append("Cliente: " + cliente + "\n");
        sb.append("Entrega: " + entrega + "\n");
        sb.append("Metodo de Pagamento: " + metodosPagamento + "\n");
        sb.append("Items de Pedido: " + printItems());
        sb.append("Valor total: " + valorPedido);
        return sb.toString();
    }
}
