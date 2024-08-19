import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public String nome;
    public String matricula;
    public String curso;
    private List<Double> notas = new ArrayList<>();

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void adicionarNota(Double nota) {
        notas.add(nota);
    }

    public Double getMedia() {
        Double media = 0.0;
        for (Double nota : notas) {
            media += nota;
        }
        return (media / notas.size());
    }

}
