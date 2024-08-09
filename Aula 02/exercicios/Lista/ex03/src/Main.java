public class Main {
    public static void main(String[] args) {
        IOF.showMessage("Informe o primeiro valor: ");
        float x = IOF.inputFloat();
        IOF.showMessage("Informe o segundo valor: ");
        float y = IOF.inputFloat();

        IOF.showMessage("Soma: " + Operations.sum(x, y));
        IOF.showMessage("Subtração: " + Operations.subtraction(x, y));
        IOF.showMessage("Divisão: " + Operations.division(x, y));
        IOF.showMessage("Multiplicação: " + Operations.multiplication(x, y));
    }
}