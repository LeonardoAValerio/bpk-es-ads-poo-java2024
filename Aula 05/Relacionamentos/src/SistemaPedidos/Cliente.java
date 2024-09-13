package SistemaPedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private List<Endereco> enderecos;

    public Cliente(String nome, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        enderecos = new ArrayList<>();
        cadastrarEndereco(endereco);
        setEnderecoAtual(endereco);
    }

    public void cadastrarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void setEnderecoAtual(Endereco enderecoAlterar) {
        boolean existEndereco = false;
        for (Endereco endereco : enderecos) {
            if(Objects.equals(endereco, enderecoAlterar)) {
                endereco.setEnderecoAtual(true);
                existEndereco = true;
            }
        }
        if(!existEndereco) throw new IllegalArgumentException("Endereco não existe");
    }

    public Endereco getEnderecoAutual() {
        for(Endereco endereco : enderecos) {
            if(endereco.isEnderecoAtual()) {
                return endereco;
            }
        }
        throw new RuntimeException("ERRO: Não tem endereco atual");
    }

    @Override
    public String toString() {
        return "Cliente: " + nome +
                ", " + cpf +
                ", " + telefone +
                ", Endereco:" + getEnderecoAutual();
    }
}
