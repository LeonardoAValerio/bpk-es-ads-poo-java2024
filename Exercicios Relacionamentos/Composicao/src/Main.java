public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dragões de éter", "Rafael Dracoon");
        livro.adicionarPagina("Era uma vez uma menina de capa vermelha...");
        livro.adicionarPagina("Um grande pirata chamado Simba...");
        System.out.println(livro);
    }
}