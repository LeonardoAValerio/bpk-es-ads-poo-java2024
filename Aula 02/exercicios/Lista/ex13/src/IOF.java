import java.util.Scanner;

public class IOF {
    public static float inputFloat() {
        return Float.parseFloat(input());
    }

    public static int inputInt() {
        return Integer.parseInt(input());
    }

    public static char inputChar() {
        return input().charAt(0);
    }

    public static String inputText() {
        return input();
    }

    public static void showMessage(String msg) {
        System.out.println(msg);
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
