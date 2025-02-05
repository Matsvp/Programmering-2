import java.time.LocalDate;        // For å representere utgivelsesdato
import java.util.ArrayList;        // For ArrayList<Episode>

public class TVSeries {

    // 1) Instansvariabler
    private String title;               // Seriens navn
    private String description;         // Kort beskrivelse
    private LocalDate releaseDate;      // Dato serien ble utgitt
    private ArrayList<Episode> episodes;// Liste over alle episodene

    // Oppgave 2.5: Holde oversikt over gjennomsnittlig spilletid
    private double averageRunTime;      

    // Oppgave 2.7: Holde på antall sesonger
    private int numSeasons;            

    /**
     * 2) Konstruktør
     */
    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;

        // Opprette en tom ArrayList som kan fylles med Episode-objekter
        this.episodes = new ArrayList<>();

        // Standardverdier
        this.averageRunTime = 0.0;
        this.numSeasons = 0;
    }

    /**
     * 3) Get- og set-metoder for tittel, beskrivelse, releaseDate
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    // Oppgave 2.5: Kun en "getter" for averageRunTime
    public double getAverageRunTime() {
        return averageRunTime;
    }

    // Oppgave 2.7: Kun en "getter" for numSeasons
    public int getNumSeasons() {
        return numSeasons;
    }

    /**
     * 4) Legge til en episode i serien. 
     *    Samtidig skal vi:
     *     - Sjekke at sesongnummeret ikke hopper over (oppgave 2.7).
     *     - Oppdatere numSeasons hvis vi begynner en ny sesong.
     *     - Oppdatere gjennomsnittlig spilletid.
     */
    public void addEpisode(Episode episode) {
        // Episodens sesongnummer
        int episodeSeason = episode.getSeasonNumber();

        // Sjekke om episodeSeason er høyere enn (numSeasons + 1)
        // Hvis ja, er det for stort "hopp", og vi tillater ikke å legge til.
        if (episodeSeason > numSeasons + 1) {
            System.out.println("Feil: Kan ikke legge til episode i sesong "
                    + episodeSeason + ", da serien foreløpig har "
                    + numSeasons + " sesonger.");
            return;  // Avslutter metoden uten å legge til
        }

        // Hvis episoden sin sesong er nøyaktig (numSeasons + 1),
        // betyr det at vi starter en ny sesong.
        if (episodeSeason == numSeasons + 1) {
            numSeasons++; 
        }

        // Nå er sesongnummeret gyldig, og vi legger til episoden
        episodes.add(episode);

        // Kall på privat metode for å oppdatere gjennomsnittlig spilletid
        updateAverageRuntime();
    }

    /**
     * 5) Hente ut alle episoder i en spesifikk sesong
     */
    public ArrayList<Episode> getEpisodesInSeason(int season) {
        ArrayList<Episode> result = new ArrayList<>();
        for (Episode e : episodes) {
            if (e.getSeasonNumber() == season) {
                result.add(e);
            }
        }
        return result;
    }

    /**
     * Privat metode for å oppdatere gjennomsnittlig spilletid
     */
    private void updateAverageRuntime() {
        if (episodes.isEmpty()) {
            averageRunTime = 0.0;
            return;
        }
        int totalRuntime = 0;
        for (Episode e : episodes) {
            totalRuntime += e.getRuntime();
        }
        // Typekonvertering til double for å unngå heltallsdivisjon
        averageRunTime = (double) totalRuntime / episodes.size();
    }

    /**
     * 6) toString() for å skrive ut info om TVSeries-objektet
     */
    @Override
    public String toString() {
        return "TV series Title: " + title + "\n"
             + "Description: " + description + "\n"
             + "Release date: " + releaseDate + "\n"
             + "Number of episodes: " + episodes.size() + "\n"
             + "Number of seasons: " + numSeasons + "\n"
             + String.format("Average runtime: %.2f minutes", averageRunTime);
    }
}

