package oblig_4;


import java.io.File;

public class JSONMain {
    public static void main(String[] args) {
        TVSeriesJSONRepository jsonRepo = new TVSeriesJSONRepository(new File("tvseries.json"));

        // Hent spesifikk TV-serie
        System.out.println("\nHenter 'Breaking Bad' fra JSON:");
        TVSeries foundSeries = jsonRepo.getTVSeriesByTitle("Breaking Bad");

        if (foundSeries != null) {
            System.out.println("Fant serie: " + foundSeries);
        } else {
            System.out.println("Serie ikke funnet.");
        }
    }
}




