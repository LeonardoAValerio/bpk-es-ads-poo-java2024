public class Main {
    public static void main(String[] args) {
        IOF.showMessage("Informe um valor inteiro: ");
        int num = IOF.inputInt();
        if(isPrimo(num)) {
            IOF.showMessage(num + " é primo");
        }else {
            IOF.showMessage(num + " não é primo");
        }
    }

    public static boolean isPrimo(int num) {
        if (num == 2) {
            return true;
        }else if (num == 3) {
            return true;
        } else{
            for(int i = num/2; i > 1; i--) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
