public class ContaBancaria {
    private Integer saldo;
    private String numeroDaConta;

    public ContaBancaria(Integer saldo, String numeroDaConta) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public void depositar(Integer valor) {
        saldo += valor;
        showConta();
    }

    public void sacar(Integer valor) {
        if (saldo - valor < 0) return;
        saldo -= valor;
        showConta();
    }

    public void showConta() {
        System.out.println("Numero da conta: " + numeroDaConta + "\nSaldo: " + saldo + "\n");
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setSaldo(Integer saldo) {
        if(saldo == null) return;
        if(saldo < 0) return;
        this.saldo = saldo;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        if(numeroDaConta == null) return;
        if(numeroDaConta == "") return;
        this.numeroDaConta = numeroDaConta;
    }
}
