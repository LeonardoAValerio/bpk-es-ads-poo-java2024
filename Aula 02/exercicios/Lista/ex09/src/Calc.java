public class Calc {
    public static void run() {
        for(;;) {
            calculate();
            if(!menu()) break;
        }
    }

    private static float getValue(String display) {
        IOF.showMessage(display);
        return IOF.inputFloat();
    }

    private static void printResult(float x, float y, char symbol, float result) {
        IOF.showMessage(x + " " + symbol + " " + y + " = " + result);
    }

    private static void calculate() {
        int check;
        float x = getValue("Insira o primeiro valor: ");
        float y = getValue("Insira o segundo valor: ");
        IOF.showMessage("Insira o sinal do cálculo (+, -, *, /): ");
        char symbol = IOF.inputChar();
        switch (symbol) {
            case '+':
                printResult(x, y, symbol, Operations.sum(x, y));
                break;
            case '-':
                printResult(x, y, symbol, Operations.subtraction(x, y));
                break;
            case '/':
                printResult(x, y, symbol, Operations.division(x, y));
                break;
            case '*':
                printResult(x, y, symbol, Operations.multiplication(x, y));
                break;
            default:
                IOF.showMessage("Operação inválida!");
        }
    }

    private static boolean menu() {
        IOF.showMessage("Deseja fazer mais um cálculo? \n[1] - Sim\n[0] - Não");
        int check = IOF.inputInt();
        if(check == 1) {
            return true;
        } else if (check == 0) {
            return false;
        } else {
            return menu();
        }
    }
}
