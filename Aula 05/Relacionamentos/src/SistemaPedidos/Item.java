package SistemaPedidos;

public class Item {
    private Integer quantidade;
    private Produto produto;
    private Double valorTotal;

    public Item(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        valorTotal = quantidade * this.produto.getValor();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantidade=" + quantidade +
                ", " + produto +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
