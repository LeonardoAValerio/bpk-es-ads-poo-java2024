public class ContaBancaria {
    private int saldo;
    private String numeroDaConta;

    public ContaBancaria(int saldo, String numeroDaConta) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public void depositar(int valor) {
        saldo += valor;
        showConta();
    }

    public void sacar(int valor) {
        if (saldo - valor < 0) return;
        saldo -= valor;
        showConta();
    }

    public void showConta() {
        System.out.println("Numero da conta: " + numeroDaConta + "\nSaldo: " + saldo + "\n");
    }
}
