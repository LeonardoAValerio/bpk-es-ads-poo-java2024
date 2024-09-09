package Autoria;

public class TesteAutoria {
    public static void main(String[] args) {
        Autor autor = new Autor("Stephen King", "EUA");
        autor.escreverLivro(new Livro("Livro Legal", "8918204", autor));
        autor.escreverLivro(new Livro("Coisa Daora", "1298312", autor));
        System.out.println(autor);
    }
}
