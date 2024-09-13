package SistemaPedidos;

public class Funcionario {
    private String nome;
    private Double salario;
    private String pis;

    public Funcionario(String nome, Double salario, String pis) {
        this.nome = nome;
        this.salario = salario;
        this.pis = pis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    @Override
    public String toString() {
        return nome;
    }
}
