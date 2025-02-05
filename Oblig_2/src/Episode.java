public class Episode {

    // 1) Instansvariabler (private)
    private String title;         // Episodens tittel
    private int episodeNumber;    // Episodens nummer i sesongen 
    private int seasonNumber;     // Hvilken sesong episoden hører til
    private int runtime;          // Spilletid i minutter

    /**
     * 2) Konstruktør (constructor) med alle variabler
     * 
     * Konstruktøren er en metode med samme navn som klassen.
     * Brukes når vi lager (instansierer) en Episode.
     */
    public Episode(String title, int episodeNumber, int seasonNumber, int runtime) {
        // 'this' refererer til den "nåværende" klassen sin instans.
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtime = runtime;
    }

    /**
     * 3) Overload-konstruktør (uten runtime)
     * 
     * Om man ikke vet spilletiden når man oppretter episoden,
     * kan man bruke denne konstruktøren.
     */
    public Episode(String title, int episodeNumber, int seasonNumber) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtime = 0;  // Setter en standardverdi til spilletid
    }

    /**
     * 4) Get- og set-metoder
     * 
     * Disse brukes for å hente ut (get) og oppdatere (set) verdier 
     * fra utsiden av klassen. 
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    /**
     * 5) toString() – gjør at når man skriver System.out.println(episodeObjekt),
     *    så får man en beskrivende tekst om objektet i konsollen.
     */
    @Override
    public String toString() {
        return "Episode title: " + title + "\n"
             + "Episode number: " + episodeNumber + "\n"
             + "Season number: " + seasonNumber + "\n"
             + "Runtime in minutes: " + runtime + "\n";
    }
}
