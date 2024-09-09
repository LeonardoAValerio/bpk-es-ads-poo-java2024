package RelacionamentoPessoa;

public class TesteRelacionamento {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Leonardo", 17);
        p1.incluirEndereco(new Endereco("Concordia", "1989", "Líder", "Marechal Cândido Rondon"));
        p1.incluirEndereco(new Endereco("Concordia", "1989", "Líder", "Marechal Cândido Rondon"));
        System.out.println(p1);
    }
}
