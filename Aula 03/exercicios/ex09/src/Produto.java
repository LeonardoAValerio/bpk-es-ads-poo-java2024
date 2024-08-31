public class Produto {
    private String nome;
    private Double preco;
    private Integer qtdEstoque;
    private Double totalEstoque;

    public Produto(String nome, Double preco, Integer qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void addEstoque(Integer qtd) {
        qtdEstoque += qtd;
        calcTotalEstoque();
    }

    public void removeEstoque(Integer qtd) {
        if(qtdEstoque - qtd <= 0) qtdEstoque = 0;
        qtdEstoque -= qtd;
        calcTotalEstoque();
    }

    private void calcTotalEstoque() {
        totalEstoque = qtdEstoque * preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) return;
        if(nome == "") return;
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if(preco == null) return;
        if(preco < 0) return;
        this.preco = preco;
        calcTotalEstoque();
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        if(qtdEstoque == null) return;
        if(qtdEstoque < 0) return;
        this.qtdEstoque = qtdEstoque;
        calcTotalEstoque();
    }

    @Override
    public String toString() {
        return "Produto: " + nome
                + "\nPreço: " + preco
                + "\nQuantidade em Estoque: " + qtdEstoque
                + "\nValor total estoque: " + totalEstoque + "\n\n";
    }
}
