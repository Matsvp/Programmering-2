import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1. Opprett noen Person-objekter (regissører/skuespillere)
        Person director1 = new Person("Steven", "Spielberg");
        Person director2 = new Person("Martin", "Scorsese");

        Person actor1 = new Person("Robert", "Downey Jr.");
        Person actor2 = new Person("Scarlett", "Johansson");
        Person actor3 = new Person("Chris", "Evans");

        // 2. Opprett Movie-objekter
        Movie movie1 = new Movie(
                "The Avengers",
                143,
                LocalDate.of(2012, 4, 25),
                "Superhelter som redder verden",
                director1);

        Movie movie2 = new Movie(
                "Shutter Island",
                138,
                LocalDate.of(2010, 2, 19),
                "Thriller film",
                director2);

        // Skriv ut titler
        System.out.println("Movie1 tittel: " + movie1.getTitle());
        System.out.println("Movie2 tittel: " + movie2.getTitle());

        // 3. Opprett noen Roller og legg dem til i movie1
        Role role1 = new Role("Tony", "Stark", actor1);
        Role role2 = new Role("Natasha", "Romanoff", actor2);
        Role role3 = new Role("Steve", "Rogers", actor3);

        movie1.addToRoles(role1);
        movie1.addToRoles(role2);
        movie1.addToRoles(role3);

        System.out.println("\nRoller i " + movie1.getTitle() + ":");
        for (Role r : movie1.getRoles()) {
            System.out.println(r);
        }

        // 4. Opprett Episode-objekter
        Episode ep1 = new Episode(
                "Episode 1",
                45,
                LocalDate.of(2022, 1, 10),
                "Pilot Episode",
                director2,
                1,
                1);

        Episode ep2 = new Episode(
                "Episode 2",
                50,
                LocalDate.of(2022, 1, 17),
                "Second Episode",
                director1,
                2,
                1);

        // 5. Legg til noen roller i episodene
        ep1.addToRoles(new Role("Agent", "Carter", actor2));
        ep2.addToRoles(new Role("Hawkeye", "Clint", actor3));

        // 6. Opprett en TVSerie og legg til disse episodene
        TVSeries tvSeries = new TVSeries(
                "Marvel's Agents",
                "Marvel series",
                LocalDate.of(2022, 1, 10));
        tvSeries.addEpisode(ep1);
        tvSeries.addEpisode(ep2);

        // 7. Hent og skriv ut alle roller i TV-serien
        System.out.println("\n" + tvSeries);
        System.out.println("Alle roller i TV-serien:");
        for (Role r : tvSeries.hentRollebesetning()) {
            System.out.println(r);
        }

        // 8. Eksempel på toString() for Movie og Episode
        System.out.println("\n--- toString() DEMO ---");
        System.out.println("Movie1: " + movie1);
        System.out.println("Episode1: " + ep1);
        System.out.println("TVSeries: " + tvSeries);
    }
}

