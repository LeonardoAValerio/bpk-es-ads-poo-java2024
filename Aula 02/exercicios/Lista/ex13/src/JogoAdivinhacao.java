import java.util.Random;

public class JogoAdivinhacao {
    private static int num;

    public void run() {
        num = getNum();
        startGame();
    }

    private static int getNum() {
        Random rand = new Random();
        return rand.nextInt(101);
    }

    private static void startGame() {
        IOF.showMessage("Informe um número: ");
        int choice = IOF.inputInt();
        if(choice > num) {
            IOF.showMessage("Número é menor!");
            startGame();
        } else if (choice < num) {
            IOF.showMessage("Número é maior!");
            startGame();
        } else {
            IOF.showMessage("Acertou!");
        }
    }
}
