public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(8, "V8", TipoCombustivel.GASOLINA, 10);
        Carro carro = new Carro("Mustang", motor);
        System.out.println(carro);
        carro.ligarCarro();
        carro.acionarAcelerador(100);
        System.out.println(carro);
    }
}