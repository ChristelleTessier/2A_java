package fr.ensai.library;


/**
 * Represents a book.
 */
public class Book extends Item { // On ajoute l'héritage ici

    // Attributes spécifiques à Book
    private String isbn;
    private Author author;

    /**
     * Constructs a new Book object.
     */
    public Book(String isbn, String title, Author author, int year, int pageCount) {
        // Appelle le constructeur de Item (la classe mère)
        // Les attributs title, year et pageCount y sont gérés
        super(title, year, pageCount); 
        
        // On initialise les attributs propres à Book
        this.isbn = isbn;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return String.format("Book %s written by %s", this.title, this.author);
    }

}
