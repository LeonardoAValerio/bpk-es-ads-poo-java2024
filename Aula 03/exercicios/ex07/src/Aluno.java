import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private Double media;
    private List<Double> notas = new ArrayList<>();

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void adicionarNota(Double nota) {
        notas.add(nota);
        caldMedia();
    }

    private void caldMedia() {
        media = notas.stream().mapToDouble(n -> n).average().getAsDouble();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        if(nome == null) return;
        if(nome == "") return;
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        if(matricula == null) return;
        if(matricula == "") return;
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        if(curso == null) return;
        if(curso == "") return;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", media=" + media +
                '}';
    }
}
