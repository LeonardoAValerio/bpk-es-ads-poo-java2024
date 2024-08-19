public class Cidade {
    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentaPopulacao(int qtd) {
        populacao += qtd;
        showPopulacao();
    }

    public void diminuirPolucao(int qtd) {
        if(populacao - qtd <= 0) {
            populacao = 0;
        }else {
            populacao -= qtd;
        }
        showPopulacao();
    }

    public void showPopulacao() {
        System.out.printf("%s: %d moradores!\n", nome, populacao);
    }
}
