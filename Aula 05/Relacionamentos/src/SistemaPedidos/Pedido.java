package SistemaPedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Double valorPedido;
    private Cliente cliente;
    private List<Item> items;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        valorPedido = 0.0;
        items = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        items.add(item);
        valorPedido += item.getValorTotal();
    }

    public void removerItem(Item item) {
        items.remove(item);
        valorPedido -= item.getValorTotal();
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public Cliente getCliente() {
        return cliente;
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
        return "Cliente{" + cliente + "}\n" +
                "Valor Total: " + valorPedido +
                "\nitems: " + printItems();
    }
}
