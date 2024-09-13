package SistemaPedidos;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String logradouro;
    private boolean enderecoAtual;

    public Endereco(String rua, String bairro, String cidade, String logradouro) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public boolean isEnderecoAtual() {
        return enderecoAtual;
    }

    public void setEnderecoAtual(boolean enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }

    @Override
    public String toString() {
        return rua +
                ", " + logradouro +
                ", " + bairro +
                ", " + cidade;
    }
}
