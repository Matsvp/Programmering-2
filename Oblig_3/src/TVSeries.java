import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TVSeries {

    private String title;
    private String description;
    private LocalDate releaseDate;
    private List<Episode> episodes = new ArrayList<>();

    // Konstruktør
    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    // Metode for å legge til en Episode i serien
    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    /**
     * Oppgave 2.7
     * Hent alle roller i alle episodene som tilhører TVSerien.
     * Returnerer en liste med roller (kan inneholde duplikater).
     */
    public List<Role> hentRollebesetning() {
        List<Role> allRoles = new ArrayList<>();
        for (Episode episode : episodes) {
            allRoles.addAll(episode.getRoles()); 
        }
        return allRoles;
    }

    @Override
    public String toString() {
        return "TVSerie: " + title +
               ", Beskrivelse: " + description +
               ", Utgivelsesdato: " + releaseDate +
               ", Antall episoder: " + episodes.size();
    }
}
