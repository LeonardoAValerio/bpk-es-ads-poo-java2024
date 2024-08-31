public class Pessoa {
    private String name;
    private Integer idade;
    private Double altura;

    public Pessoa(String name, Integer idade, Double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String presentation() {
        return "Olá! Meu nome é " + name + " e tenho " + idade + " anos!";
    }

    public String getName() {
        return name;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setName(String name) {
        if (name == null) return;
        if (name == "") return;
        this.name = name;
    }

    public void setIdade(Integer idade) {
        if (idade == null) return;
        if (idade < 0) return;
        this.idade = idade;
    }

    public void setAltura(Double altura) {
        if (altura == null) return;
        if (altura < 0) return;
        this.altura = altura;
    }
}
