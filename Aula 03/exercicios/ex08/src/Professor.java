public class Professor {
    public String nome;
    public String disciplina;
    public double salario;
    public int energia = 10;

    public Professor(String nome, String disciplina, double salario) {
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

    public void corrigirProva() {
        if(energia <= 0) {
            System.out.println("Muito cansado para corrigir provas!\nDescanse um pouco!");
        }else {
            System.out.printf("%s corrigiu as provas de %s\n", nome, disciplina);
            energia -= 1;
        }
    }
}
