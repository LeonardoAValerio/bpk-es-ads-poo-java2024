public class Main {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
        for(int i = 0; i < 5; i++) {
            IOF.showMessage("Informe o valor " + (i+1) + " do array: ");
            numeros[i] = IOF.inputInt();
        }
        numeros = QSort.crescent(numeros);
        for(int i = 0; i < 5; i++) {
            IOF.showMessage("[" + (i+1) + "]: " +numeros[i]);
        }
    }
}
