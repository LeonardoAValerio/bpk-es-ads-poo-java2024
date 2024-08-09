import java.util.Scanner;

public class IOF {
    public static double inputDouble() {
        return Double.parseDouble(input());
    }

    public static int inputInt() {
        return Integer.parseInt(input());
    }

    public static void showMessage(String msg) {
        System.out.println(msg);
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
