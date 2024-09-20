public class Motor {
    private Integer cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private Integer rpm;
    private Integer potencia;
    private Boolean ligado;

    public Motor(Integer cilindradas, String modelo, TipoCombustivel tipoCombustivel, Integer potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = 0;
        this.potencia = potencia;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Motor ligou!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Motor Desligou!");
    }

    public void aumentarPotencia(Integer incremento) {
        if(incremento < 0 || !ligado) throw new RuntimeException("Erro");
        potencia += incremento;
    }

    public void reduzirPotencia(Integer decremento) {
        if(rpm - decremento < 0 || !ligado) throw new RuntimeException("Erro");
        potencia -= decremento;
    }

    public void acelerar(Integer incrementoRpm) {
        if(incrementoRpm < 0 || !ligado) throw new RuntimeException("Erro");
        rpm += incrementoRpm;
    }

    public void reduzirRpm(Integer decrementoRpm) {
        if(rpm - decrementoRpm < 0 || !ligado) throw new RuntimeException("Erro");
        rpm -= decrementoRpm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor: ").append(modelo).append(", ");
        sb.append("Tipo Combustivel: ").append(tipoCombustivel).append(", ");
        sb.append("RPM: ").append(rpm).append(", ");
        sb.append("Potencia: ").append(potencia);
        return sb.toString();
    }
}
