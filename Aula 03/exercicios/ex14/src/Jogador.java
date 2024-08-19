public class Jogador {
    public String nome;
    public String posicao;
    public int idade;

    public Jogador(String nome, String posicao, int idade) {
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", idade=" + idade +
                "}";
    }
}
