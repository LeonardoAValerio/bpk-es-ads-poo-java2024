public class Main {
    public static void main(String[] args) {
        IOF.showMessage("Digite uma mensagem: ");
        String str = IOF.inputText();
        if(LibStrings.isPalindromo(str)) {
            IOF.showMessage(str + " é palindromo");
        }else {
            IOF.showMessage(str + " não é palindromo");
        }
    }
}
