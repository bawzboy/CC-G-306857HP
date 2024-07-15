package UML;

public class Buch {

    String title;
    String autor;
    String isbn;

    public Buch() {
    }

    public Buch(String title, String autor, String isbn) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "\nBuch Titel: " + title + "\nAutor: " + autor + "\nISBN: " + isbn + "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
