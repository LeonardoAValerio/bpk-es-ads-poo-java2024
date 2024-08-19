public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Leonardo", 17, 1.76);
        System.out.println(p1.presentation());
        Pessoa p2 = new Pessoa("Eduardo", 18, 1.78);
        System.out.println(p2.presentation());
    }
}