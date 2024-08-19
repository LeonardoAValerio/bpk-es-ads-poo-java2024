public class Produto {
    public String nome;
    public double preco;
    public int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void addEstoque(int qtd) {
        qtdEstoque += qtd;
    }

    public void removeEstoque(int qtd) {
        if(qtdEstoque - qtd <= 0) qtdEstoque = 0;
        qtdEstoque -= qtd;
    }

    public double getTotalEstoque() {
        return qtdEstoque * preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome
                + "\nPreço: " + preco
                + "\nQuantidade em Estoque: " + qtdEstoque
                + "\nValor total estoque: " + getTotalEstoque() + "\n\n";
    }
}
