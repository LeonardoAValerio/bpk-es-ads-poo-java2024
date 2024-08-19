public class Computador {
    public String processador;
    public int memoriaRam;
    public int armazenamento;
    public boolean ligado = false;

    public Computador(String processador, int memoriaRam, int armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public void changeOn() {
        ligado = !ligado;
    }

    public void showComputer() {
        System.out.printf("Computador:\nProcessador: %s\nCapacidade memoriaRam: %d\nCapacidade armazenamento: %d\nLigado: %b\n\n", processador, memoriaRam, armazenamento, ligado);
    }
}
