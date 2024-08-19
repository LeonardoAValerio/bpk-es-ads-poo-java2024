import java.util.Scanner;

public class IOF {
    public static Scanner scanner = new Scanner(System.in);

    public static String inputText(String display) {
        System.out.println(display);
        return scanner.nextLine();
    }
}
