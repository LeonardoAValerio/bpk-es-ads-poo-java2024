public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Biromba", "1245", "Barcelona", "Toledo", "Paraná");
        Loja lojaDeJogos = new Loja("JogandoAVidaFora", endereco, "(45) 999548631");
        lojaDeJogos.switchAberta();
        lojaDeJogos.switchAberta();
    }
}