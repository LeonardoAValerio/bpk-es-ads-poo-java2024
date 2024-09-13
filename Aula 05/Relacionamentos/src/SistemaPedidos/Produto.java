package SistemaPedidos;

public class Produto {
    private String nome;
    private Double valor;
    private Integer estoque;

    public Produto(String nome, Double valor, Integer quantidadeInicial) {
        this.nome = nome;
        this.valor = valor;
        estoque = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void diminuirEstoque(Integer qtda) {
        if(qtda > estoque) {
            throw new RuntimeException("Quantidade maior que estoque!");
        }else {
            estoque-= qtda;
        }
    }

    public void aumentarEstoque(Integer qtda) {
        estoque += qtda;
    }

    @Override
    public String toString() {
        return "Produto: " +
                nome +
                " - R$" + valor;
    }
}
