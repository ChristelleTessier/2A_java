package fr.ensai.mediaplayer;

import java.util.Objects;

/**
 * Represents a song with essential attributes.
 */
public class Song extends Media {
    private Artist singer;
    private Artist composer;
    private String lyrics;

    /**
     * Constructs a new Song object.
     *
     * @param singer   The singer of the song.
     * @param composer The composer of the song.
     */
    public Song(String title, Artist singer, int year, int duration, String lyrics, Artist author, Artist composer) {
        super(title, author, year, duration, lyrics);

        this.singer = singer;
        this.lyrics = lyrics;
        this.composer = composer;
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return String.format("Song %s by %s",this.title, this.singer);
    }
    
    /**
     * Indicates whether some other object is "equal to" this one. Two Song
     * objects are considered equal if they have the same title, singer, and year.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Song otherSong = (Song) o;
        return this.year == otherSong.year &&
                Objects.equals(this.title, otherSong.title) &&
                Objects.equals(this.singer, otherSong.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.singer, this.year);
    }

    public void play() {

        if (this.lyrics == null || this.lyrics.isEmpty() ){
            System.out.println("Les paroles sont vides");
        }
        else {
            String[] mots = this.lyrics.split(" ");
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
