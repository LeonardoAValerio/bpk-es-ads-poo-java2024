package SistemaPedidos;

public class Item {
    private Integer quantidade;
    private Produto produto;
    private Double subTotal;

    public Item(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.produto.diminuirEstoque(quantidade);
        subTotal = quantidade * this.produto.getValor();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    @Override
    public String toString() {
        return  produto +
                ", Quantidade: " + quantidade +
                ", Subtotal: R$" + subTotal;
    }
}
