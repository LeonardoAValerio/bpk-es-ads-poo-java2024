public class Main {
    public static void main(String[] args) {
        Aluno leonardo = new Aluno("Leonardo", "8q91723981", "Engenharia de Software");
        leonardo.adicionarNota(80.0);
        leonardo.adicionarNota(90.0);
        leonardo.adicionarNota(100.0);
        System.out.println(leonardo.getMedia()); // 90.0
    }
}