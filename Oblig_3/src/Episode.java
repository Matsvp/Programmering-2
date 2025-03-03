import java.time.LocalDate;

public class Episode extends Production {

    private int episodeNumber;
    private int seasonNumber;

    /**
     * Konstruktør som krever tittel, spilletid, episode- og sesongnummer.
     * Kaller super(title, runtimeInMinutes).
     */
    public Episode(String title, int runtimeInMinutes, int episodeNumber, int seasonNumber) {
        super(title, runtimeInMinutes);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    /**
     * Utvidet konstruktør som tar med releaseDate, description og director
     * i tillegg til episodeNumber og seasonNumber.
     */
    public Episode(String title, int runtimeInMinutes,
                   LocalDate releaseDate, String description, Person director,
                   int episodeNumber, int seasonNumber) {
        super(title, runtimeInMinutes, releaseDate, description, director);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    // Getters og setters for episodeNumber og seasonNumber
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Episode: S" + seasonNumber + "E" + episodeNumber;
    }
}
