import java.time.LocalDate;

public class Movie extends Production {

    /**
     * Konstruktør som kun tar imot tittel
     * (bruker super-konstruktøren fra Production).
     */
    public Movie(String title) {
        super(title);
    }

    /**
     * Konstruktør som tar flere parametere, inkludert runtime, releaseDate,
     * description og director, og sender de videre til super-konstruktøren.
     */
    public Movie(String title, int runtimeInMinutes,
                 LocalDate releaseDate, String description, Person director) {
        super(title, runtimeInMinutes, releaseDate, description, director);
    }

    @Override
    public String toString() {
        return "Film - " + super.toString();
    }
}
