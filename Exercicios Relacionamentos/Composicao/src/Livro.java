import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        paginas = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo) {
        paginas.add(new Pagina(paginas.size() + 1, conteudo));
    }

    private String criaStringPaginas() {
        StringBuilder sb = new StringBuilder();
        for(Pagina pagina : paginas) {
            sb.append(pagina);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(titulo).append("\n");
        sb.append("Autor: ").append(autor).append("\n");
        sb.append(criaStringPaginas());
        return sb.toString();
    }
}
