public class Veiculo {
    public String marca;
    public String placa;
    public String cor;
    public boolean sujo = true;
    public double gasolina = 0;

    public Veiculo(String tipo, String placa, String cor) {
        this.marca = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer(double valor) {
        double qtd = valor/5.6; //Valor gasolina
        if(gasolina + qtd > 100) gasolina = 100;
        gasolina += qtd;
    }

    public void lavar() {
        if(sujo) sujo = false;
    }

    @Override
    public String toString() {
        return "Nome: " + marca + " - " + cor
                + "\nSujo: " + sujo
                + "\nGasolina: " + gasolina + "L\n";
    }
}
