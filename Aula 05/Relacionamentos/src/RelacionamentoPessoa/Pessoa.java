package RelacionamentoPessoa;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void incluirEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    @Override
    public String toString() {
        String dados = "nome: " + nome +
                        "\nidade: " + idade +
                        "\nenderecos: " + "\n";
        String enderecos = "";
        for (Endereco endereco : this.enderecos) {
            enderecos += endereco + "\n";
        }

        return dados + enderecos;
    }
}
