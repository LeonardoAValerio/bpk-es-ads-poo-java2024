public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar", "Atacante", 30);
        Jogador j2 = new Jogador("Messi", "Nãosei", 24);
        Time brasil = new Time("Brasil", "Titi");
        brasil.addJogador(j1);
        brasil.addJogador(j2);
        brasil.listJogadores();
        brasil.removeJogador(j1);
        brasil.listJogadores();
    }
}