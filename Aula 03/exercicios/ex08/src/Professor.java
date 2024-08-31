public class Professor {
    private String nome;
    private String disciplina;
    private Double salario;
    private Integer energia = 10;

    public Professor(String nome, String disciplina, Double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        if(energia <= 0) {
            System.out.println("Muito cansado para dar aula!");
        }else {
            System.out.printf("%s deu aula de %s\n", nome, disciplina);
            energia -= 5;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public int getEnergia() {
        return energia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        if(disciplina == null) return;
        if(disciplina == "") return;
        this.disciplina = disciplina;
    }

    public void setSalario(Double salario) {
        if(salario == null) return;
        if(salario < 0) return;
        this.salario = salario;
    }

    public void setEnergia(Integer energia) {
        if(energia == null) return;
        if(energia < 0 || energia > 10) return;
        this.energia = energia;
    }

    public void corrigirProva() {
        if(energia <= 0) {
            System.out.println("Muito cansado para corrigir provas!\nDescanse um pouco!");
        }else {
            System.out.printf("%s corrigiu as provas de %s\n", nome, disciplina);
            energia -= 1;
        }
    }


}
