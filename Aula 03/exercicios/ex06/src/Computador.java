public class Computador {
    private String processador;
    private Integer memoriaRam;
    private Integer armazenamento;
    private boolean ligado = false;

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

    public String getProcessador() {
        return processador;
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public Integer getArmazenamento() {
        return armazenamento;
    }

    public void setProcessador(String processador) {
        if(processador == null) return;
        if(processador == "") return;
        this.processador = processador;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        if(memoriaRam == null) return;
        if(memoriaRam < 0) return;
        this.memoriaRam = memoriaRam;
    }

    public void setArmazenamento(Integer armazenamento) {
        if(armazenamento == null) return;
        if(armazenamento < 0) return;
        this.armazenamento = armazenamento;
    }
}
