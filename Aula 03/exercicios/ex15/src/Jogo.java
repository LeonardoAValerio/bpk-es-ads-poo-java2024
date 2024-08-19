public class Jogo {
    public String nome;
    public String genero;
    public double price;
    public boolean rodando = false;

    public Jogo(String nome, String genero, double price) {
        this.nome = nome;
        this.genero = genero;
        this.price = price;
    }

    public void switchPlay() {
        rodando = !rodando;
        System.out.println(nome + " está rodando: " + rodando);
    }
}
