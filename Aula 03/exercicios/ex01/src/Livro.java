public class Livro {
    private String title;
    private String author;
    private Integer maxPages;
    private Integer actualPage = 0;
    private boolean opened = false;

    public Livro(String title, String author, Integer maxPages) {
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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getMaxPages() {
        return maxPages;
    }

    public Integer getActualPage() {
        return actualPage;
    }

    public void setTitle(String title) {
        if(title == null) return;
        if(title == "") return;
        this.title = title;
    }

    public void setAuthor(String author) {
        if(author == null) return;
        if(author == "") return;
        this.author = author;
    }

    public void setMaxPages(Integer maxPages) {
        if(maxPages == null) return;
        if(maxPages < 0) return;
        actualPage = 0;
        this.maxPages = maxPages;
    }

    public void setActualPage(Integer actualPage) {
        if(actualPage == null) return;
        if(actualPage < 0) return;
        if(actualPage > maxPages) return;
        this.actualPage = actualPage;
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
