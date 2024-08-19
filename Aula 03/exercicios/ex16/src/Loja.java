public class Loja {
    public String nome;
    public Endereco endereco;
    public String telefone;
    public boolean aberta = false;

    public Loja(String nome, Endereco endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void switchAberta() {
        aberta = !aberta;
        System.out.printf("%s está aberta: %b\n", nome, aberta);
    }

}
