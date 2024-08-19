public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry potter", "Josimar", 200);
        l1.readPage();
        l1.switchOpen();
        l1.readPage();
        System.out.println(l1);
    }
}