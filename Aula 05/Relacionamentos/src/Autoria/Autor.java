package Autoria;

import RelacionamentoPessoa.Endereco;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String nacionalidade;
    private List<Livro> livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        livros = new ArrayList<>();
    }

    public void escreverLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public String toString() {
        String dados = "Nome: " + nome +
                "\nNacionalidade: " + nacionalidade +
                "\nLivros: " + "\n";
        String livros = "";
        for (Livro livro : this.livros) {
            livros += livro + "\n";
        }
        return dados + livros;
    }
}
