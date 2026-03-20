package fr.ensai.mediaplayer;

public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;

    /**
     * Constructs a new Artist object.
     *
     * @param firstName  prenom
     * @param lastName   nom
     * @param nationality nationalité.
     */
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return String.format(this.firstName," ",this.lastName);
    }
    
}
