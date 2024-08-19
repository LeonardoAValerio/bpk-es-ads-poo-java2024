public class Cozinha {
    public String tipo;
    public String cor;
    public int quantidadeDePessoas;

    public Cozinha(String tipo, String cor, int quantidadeDePessoas) {
        this.tipo = tipo;
        this.cor = cor;
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public void cozinhar() {
        if(!(quantidadeDePessoas > 0)) return;
        System.out.println("Cozinharam!");
    }

    public void limpar() {
        if(!(quantidadeDePessoas == 0)) return;
        System.out.println("Limparam!");
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }
}
