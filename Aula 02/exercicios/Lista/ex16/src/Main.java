public class Main {
    public static void main(String[] args) {
        for(;;) {
            IOF.showMessage("Deseja temperatura em Celsius ou Fahrenheit: \n[2] - Celsius\n[1] - Fahrenheit");
            int option = IOF.inputInt();
            if(option == 2) {
                IOF.showMessage("Insira uma temperatura em Celsius: ");
                double temp = IOF.inputDouble();
                IOF.showMessage("Celsius: " + temp);
                IOF.showMessage("Fahrenheit: " + Temp.convertToFahrenheit(temp));
                break;
            }else if(option == 1) {
                IOF.showMessage("Insira uma temperatura em Fahrenheit: ");
                double temp = IOF.inputDouble();
                IOF.showMessage("Fahrenheit: " + temp);
                IOF.showMessage("Celsius: " + Temp.convertToCelsius(temp));
                break;
            }else {
                IOF.showMessage("Opção inválida, tente novamente!");
            }
        }
    }
}
