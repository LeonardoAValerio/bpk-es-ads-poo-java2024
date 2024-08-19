public class Main {
    public static void main(String[] args) {
        Produto banana = new Produto("Banana", 5.6, 10);
        banana.addEstoque(5);
        banana.removeEstoque(2);
        System.out.println(banana);
    }
}