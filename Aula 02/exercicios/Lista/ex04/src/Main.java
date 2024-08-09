public class Main {
    public static void main(String[] args) {
        IOF.showMessage("Informe um valor: ");
        int x = IOF.inputInt();

        if(x % 2 == 0) {
            IOF.showMessage(x + " é par");
        }else {
            IOF.showMessage(x + " é impar");
        }
    }
}