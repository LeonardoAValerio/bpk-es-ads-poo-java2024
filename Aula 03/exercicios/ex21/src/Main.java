public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Comida", "Amarelo", 100);
        cozinha.limpar();
        cozinha.cozinhar();
        cozinha.setQuantidadeDePessoas(0);
        cozinha.limpar();
        cozinha.cozinhar();
    }
}