package oblig_4;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class CSVMain {
    public static void main(String[] args) {
        // Opprett repository med en CSV-fil
        TVSeriesCSVRepository csvRepo = new TVSeriesCSVRepository(new File("tvseries.csv"));

        // Opprett noen TV-serier
        TVSeries series1 = new TVSeries("Marvel's Agents", "Marvel series", LocalDate.of(2022, 1, 10));
        TVSeries series2 = new TVSeries("Breaking Bad", "Crime/Drama series", LocalDate.of(2008, 1, 20));

        // Lagre til CSV
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(series1);
        tvSeriesList.add(series2);
        csvRepo.addListOfTVSeries(tvSeriesList);

        // Hent og skriv ut alle TV-serier fra CSV
        System.out.println("\nHenter TV-serier fra CSV:");
        for (TVSeries series : csvRepo.getAllTVSeries()) {
            System.out.println(series);
        }

        System.out.println("\nHenter 'Breaking Bad' fra CSV:");
        System.out.println(csvRepo.getTVSeriesByTitle("Breaking Bad"));
    }
}