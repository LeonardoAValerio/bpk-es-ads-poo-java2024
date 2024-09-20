public class Carro {
    private String modelo;
    private Motor motor;
    private Boolean ligado;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
        this.ligado = false;
    }

    public void ligarCarro() {
        motor.ligar();
        ligado = true;
        System.out.println("Carro ligado!");
    }

    public void desligarCarro() {
        motor.desligar();
        ligado = false;
        System.out.println("Carro desligado!");
    }

    public void turboBoost() {
        motor.aumentarPotencia(50);
    }

    public void reduzirPotenciaMotor() {
        motor.reduzirPotencia(30);
    }

    public void acionarAcelerador(int incrementoRpm) {
        motor.acelerar(incrementoRpm);
    }

    public void acionarFreio(int decrementoRpm) {
        motor.reduzirRpm(decrementoRpm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Modelo: ").append(modelo).append(", ");
        sb.append("Ligado: ").append(ligado).append(", ");
        sb.append(motor);
        return sb.toString();
    }
}
