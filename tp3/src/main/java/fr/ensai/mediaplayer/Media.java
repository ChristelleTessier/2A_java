package fr.ensai.mediaplayer;

public class Media {
    protected String title;
    protected Artist author;
    protected int year;
    protected int duration;
    protected String texte;

    /**
     * Constructs a new Song object.
     *
     * @param title    The title of the song.
     * @param author   The singer of the song.
     * @param year     The year the song was released.
     * @param duration The duration of the song in seconds.
     * @param texte    Le texte associé.
     */
    public Media(String title, Artist author, int year, int duration, String texte) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.duration = duration;
        this.texte = texte;
    }

    public void play() {

        if (this.texte == null || this.texte.isEmpty() ){
            System.out.println("Les paroles sont vides");
        }
        else {
            String[] mots = this.texte.split(" ");
            for (String mot : mots) {
            System.out.print(mot + " "); 
            try {
                Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Thread was interrupted");
                }
            }
        }
    }
    
}
