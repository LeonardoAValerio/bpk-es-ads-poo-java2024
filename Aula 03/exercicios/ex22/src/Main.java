public class Main {
    public static void main(String[] args) {
        Empresa bpk = new Empresa("10233102", "Biopark edu", 2);
        bpk.showFuncionarios();
        bpk.removeFuncionario();
        bpk.showFuncionarios();
    }
}