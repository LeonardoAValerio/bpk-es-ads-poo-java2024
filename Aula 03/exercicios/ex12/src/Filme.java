public class Filme {
    public String titulo;
    public String diretor;
    public double duracao;
    public boolean ligado = false;

    public Filme(String titulo, String diretor, double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void switchLigado() {
        ligado = !ligado;
        System.out.println("Ligado: " + ligado);
    }
}
