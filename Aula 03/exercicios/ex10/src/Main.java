public class Main {
    public static void main(String[] args) {
        Veiculo fuscaAmarelo = new Veiculo("Fusca", "AJX7252", "Amarelo");
        System.out.println(fuscaAmarelo);
        fuscaAmarelo.abastecer(30);
        System.out.println(fuscaAmarelo);
        fuscaAmarelo.lavar();
        System.out.println(fuscaAmarelo);
    }
}