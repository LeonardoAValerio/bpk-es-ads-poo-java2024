public class Main {
    public static void main(String[] args) {
        IOF.showMessage("Informe um valor: ");
        int num = IOF.inputInt();
        IOF.showMessage("Fatorial: " + Operations.recursFatorial(num));
        IOF.showMessage("Fatorial: " + Operations.iteraFatorial(num));
    }
}
