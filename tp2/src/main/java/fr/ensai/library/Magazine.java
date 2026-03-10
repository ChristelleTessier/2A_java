package fr.ensai.library;

/**
 * Represents a magazine.
 */
public class Magazine extends Item {

    // Attributes spécifiques à Book
    private String issn;
    private String issueNumber;

    /**
     * Constructs a new Book object.
     */
    public Magazine(String title, int year, int pageCount, String issn, String issueNumber) {
        // Appelle le constructeur de Item (la classe mère)
        // Les attributs title, year et pageCount y sont gérés
        super(title, year, pageCount);

        // On initialise les attributs propres à Book
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return String.format("Book %s written in %s", this.title, this.year);
    }

}
