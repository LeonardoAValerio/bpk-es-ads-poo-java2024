public class Main {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int soma = sum(x, y);
        System.out.printf("%d + %d = %d", x, y, soma);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}