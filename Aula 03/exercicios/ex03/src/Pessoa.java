public class Pessoa {
    public String name;
    public int idade;
    public double altura;

    public Pessoa(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String presentation() {
        return "Olá! Meu nome é " + name + " e tenho " + idade + " anos!";
    }
}
