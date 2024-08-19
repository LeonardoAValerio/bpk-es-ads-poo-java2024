public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1000, "12939301");
        c1.depositar(1000);
        c1.sacar(2400); //Ó, não permite!
        c1.sacar(600);
    }
}