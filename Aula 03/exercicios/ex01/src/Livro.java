public class Livro {
    public String title;
    public String author;
    public int maxPages;
    public int actualPage = 0;
    public boolean opened = false;

    public Livro(String title, String author, int maxPages) {
        this.title = title;
        this.author = author;
        this.maxPages = maxPages;
    }

    public void switchOpen() {
        this.opened = !this.opened;
    }

    public void readPage() {
        if(!opened) return;
        if(actualPage >= maxPages) return;
        actualPage++;
        System.out.println("Voce leu " + actualPage + " Páginas!");
    }

    @Override
    public String toString() {
        return "Titulo: " + title
                + "\nAutor: " + author
                + "\nTotal de páginas: "
                + maxPages + "\nPágina atual: "
                + actualPage + "\n";
    }
}
