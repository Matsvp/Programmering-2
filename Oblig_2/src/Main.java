import java.time.LocalDate;   // for dato
import java.util.ArrayList;   // for lister
import java.util.Random;      // for tilfeldig spilletid

public class Main {

    public static void main(String[] args) {

        // ====== Oppgave 2.2: Opprett et TVSeries-objekt ======
        TVSeries tvSeries = new TVSeries(
                "Mitt Liv",           // tittel
                "Dette er en serie om mitt liv",    // beskrivelse
                LocalDate.of(2020, 1, 1)       // utgivelsesdato
        );

        // ====== Opprett og legg til noen Episode-objekter ======
        // Lager to episoder
        Episode ep1 = new Episode("Pilot", 1, 1, 25);
        Episode ep2 = new Episode("Episode 2", 2, 1);  // runtime=0 til å begynne med
        ep2.setRuntime(30);  // setter spilletid med set-metoden

        // Legg episodene til tvSeries
        tvSeries.addEpisode(ep1);
        tvSeries.addEpisode(ep2);

        // ====== Oppgave 2.3: toString() utskrift ======
        System.out.println("\n--- Tester utskrift av tvSeries ---");
        System.out.println(tvSeries);

        System.out.println("\n--- Tester utskrift av en enkelt episode (ep1) ---");
        System.out.println(ep1);

        // ====== Oppgave 2.4: Lage en litt større serie med flere sesonger ======
        TVSeries bigSeries = new TVSeries(
                "Big Show",
                "Dette er en stor serie med mange sesonger",
                LocalDate.of(2021, 5, 10)
        );

        // Vi ønsker 5 sesonger, hver med 10 episoder
        // Bruker en Random for Oppgave 2.6 (spilletid mellom 20 og 30)
        Random random = new Random();

        for (int season = 1; season <= 5; season++) {
            for (int epNo = 1; epNo <= 10; epNo++) {
                // Opprett en episode
                Episode e = new Episode("Episode " + epNo, epNo, season);
                // Generer runtime mellom 20 og 30 (inkludert)
                int runtime = random.nextInt(11) + 20; // 0-10 + 20 => 20-30
                e.setRuntime(runtime);

                // Legg den til bigSeries
                bigSeries.addEpisode(e);
            }
        }

        // Test getEpisodesInSeason(4) – skal hente alle 10 episoder i sesong 4
        System.out.println("\n--- Episoder i sesong 4 av bigSeries ---");
        ArrayList<Episode> season4 = bigSeries.getEpisodesInSeason(4);
        for (Episode e : season4) {
            System.out.println(e.getTitle() + " (runtime: " + e.getRuntime() + ")");
        }

        // ====== Oppgave 2.6: Vis gjennomsnittlig spilletid ======
        System.out.println("\nGjennomsnittlig spilletid i bigSeries: "
                           + bigSeries.getAverageRunTime() + " minutter");

        // ====== Oppgave 2.7-2.8: Test at man ikke kan hoppe over sesonger ======
        // Prøver å legge til en episode i sesong 7, mens vi har 5
        Episode wrongSeasonEpisode = new Episode("Ugyldig episode", 1, 7, 25);
        bigSeries.addEpisode(wrongSeasonEpisode);  // Forvent feilmelding

        // Sjekk at antall sesonger ikke har endret seg
        System.out.println("\nAntall sesonger i bigSeries nå: " + bigSeries.getNumSeasons());

        // Legg til en episode i sesong 6 (som er nøyaktig én høyere enn 5)
        Episode season6Episode = new Episode("Episode i ny sesong", 1, 6, 28);
        bigSeries.addEpisode(season6Episode);

        System.out.println("Antall sesonger i bigSeries etter å ha lagt til sesong 6: "
                            + bigSeries.getNumSeasons());

        // Til slutt: Se hvordan bigSeries ser ut nå
        System.out.println("\n--- Tester utskrift av bigSeries ---");
        System.out.println(bigSeries);
    }
}

