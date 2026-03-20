package fr.ensai.mediaplayer;

public class Podcast extends Media {
    private Artist host;
    private String topic;
    private String subtitle;

    /**
     * Constructs a new Song object.
     *
     * @param host     auteur du podcast
     * @param topic     sujet du podcast
     * @param subtitle sous titre
     */
    public Podcast(String title, Artist host, String topic, int duration, int year, String subtitle) {
        super(title, host, year, duration, subtitle);

        this.host = host;
        this.topic = topic;
        this.subtitle = subtitle;
    }
    
}
