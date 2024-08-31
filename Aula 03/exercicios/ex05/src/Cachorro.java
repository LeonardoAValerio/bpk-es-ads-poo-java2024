public class Cachorro {
    private String nome;
    private String raca;
    private Integer idade;

    public Cachorro(String nome, String raca, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.printf("%s latiu!\n", nome);
    }

    public void correr() {
        System.out.printf("%s correu!\n", nome);
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        if(nome == null) return;
        if(nome == "") return;
        this.nome = nome;
    }

    public void setRaca(String raca) {
        if(raca == null) return;
        if(raca == "") return;
        this.raca = raca;
    }

    public void setIdade(Integer idade) {
        if(idade == null) return;
        if(idade < 0) return;
        this.idade = idade;
    }
}
