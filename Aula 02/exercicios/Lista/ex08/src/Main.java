public class Main {
    public static void main(String[] args) {
        IOF.showMessage("Fale teu nome: ");
        String nome = IOF.inputText();
        IOF.showMessage("Fale tua idade: ");
        int idade = IOF.inputInt();
        IOF.showMessage("Nome: " + nome + "\nIdade: " + idade);
    }
}