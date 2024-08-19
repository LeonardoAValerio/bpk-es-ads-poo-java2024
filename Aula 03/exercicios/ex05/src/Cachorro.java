public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.printf("%s latiu!\n", nome);
    }

    public void correr() {
        System.out.printf("%s correu!\n", nome);
    }
}
