import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Production {

    private String title;
    private int runtimeInMinutes;
    private LocalDate releaseDate;
    private String description;
    private Person director;
    private List<Role> roles = new ArrayList<>();

    /**
     * Konstruktør 1:
     * Tar imot title og runtimeInMinutes.
     */
    public Production(String title, int runtimeInMinutes) {
        this.title = title;
        this.runtimeInMinutes = runtimeInMinutes;
    }

    /**
     * Konstruktør 2:
     * Tar kun imot title.
     */
    public Production(String title) {
        this.title = title;
    }

    public Production(String title, int runtimeInMinutes,
                      LocalDate releaseDate, String description,
                      Person director) {
        this.title = title;
        this.runtimeInMinutes = runtimeInMinutes;
        this.releaseDate = releaseDate;
        this.description = description;
        this.director = director;
    }

    // Getters og setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    // Roller
    public List<Role> getRoles() {
        // Returnerer en kopi for å unngå at man kan modifisere listen direkte utenom klassen
        return new ArrayList<>(roles);
    }

    public void addToRoles(Role role) {
        roles.add(role);
    }

    public void addToRoles(ArrayList<Role> listOfRoles) {
        roles.addAll(listOfRoles);
    }

    @Override
    public String toString() {
        return "Tittel: " + title +
                ", Spilletid: " + runtimeInMinutes + " min" +
                (releaseDate != null ? ", Utgivelsesdato: " + releaseDate : "") +
                (description != null ? ", Beskrivelse: " + description : "") +
                (director != null ? ", Regissør: " + director.getFullName() : "");
    }
}
