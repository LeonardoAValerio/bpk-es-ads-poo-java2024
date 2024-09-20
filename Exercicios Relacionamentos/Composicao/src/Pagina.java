public class Pagina {
    private Integer numero;
    private String conteudo;

    public Pagina(Integer numero, String conteudo) {
        this.numero = numero;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pagina ").append(numero).append(":\n");
        sb.append(conteudo).append("\n");
        return sb.toString();
    }
}
