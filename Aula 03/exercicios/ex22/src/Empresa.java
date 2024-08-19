import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {
    public String CPNJ;
    public String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String CPNJ, String nome, int qtdFuncionarios) {
        this.CPNJ = CPNJ;
        this.nome = nome;
        for (int i = 0; i < qtdFuncionarios; i++) {
            addFuncionario();
        }
    }

    public void addFuncionario() {
        String nome = IOF.inputText("Informe o nome do funcionário: ");
        String CPF = IOF.inputText("Informe o CPF do funcionário: ");
        int idade = Integer.parseInt(IOF.inputText("Informe a idade do funcionário: "));
        funcionarios.add(new Funcionario(CPF, nome, idade));
    }

    public void removeFuncionario() {
        String nomeFuncionario = IOF.inputText("Informe o nome do funcionario que sera removido: ");
        for (Funcionario funcionario : funcionarios) {
            if(Objects.equals(funcionario.nome, nomeFuncionario)) funcionarios.remove(funcionario);
        }
    }

    public void showFuncionarios() {
        System.out.println("Lista funcionarários: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
