public class Bicicleta {
    public String marca;
    public String modelo;
    public int tamanhoRoda;
    public int velocidade;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void andar() {
        velocidade++;
        showVelocidade();
    }

    public void frear() {
        if (velocidade > 10) {
            System.out.println("Morreu!");
            return;
        }else {
            velocidade = 0;
        }
        showVelocidade();
    }

    public void showVelocidade() {
        System.out.println("Velocidade atual: " + velocidade);
    }
}
