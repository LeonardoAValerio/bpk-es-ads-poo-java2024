public class Main {
    public static void main(String[] args) {
        IOF.showMessage("Insira um texto: ");
        String str = IOF.inputText();
        IOF.showMessage(str + " tem " +  LibString.contVowel(str) + " vogais");
    }
}
