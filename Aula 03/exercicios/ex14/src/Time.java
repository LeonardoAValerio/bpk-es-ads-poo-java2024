import java.util.ArrayList;
import java.util.List;

public class Time {
    public String nome;
    public String tecnico;
    private List<Jogador> jogadores = new ArrayList<>();

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public void listJogadores() {
        System.out.println("Lista dos Jogadores: ");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
        System.out.println("");
    }
}
