public class LivroDigital {
    public String titulo;
    public String autor;
    public double tamanhoDoArquivo;
    public boolean aberto = false;

    public LivroDigital(String titulo, String autor, double tamanhoDoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    public void switchAberto() {
        aberto = !aberto;
        System.out.printf("%s está aberto: %b\n", titulo, aberto);
    }
}
