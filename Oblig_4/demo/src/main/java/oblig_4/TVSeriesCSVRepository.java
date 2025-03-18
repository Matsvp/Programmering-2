package oblig_4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeriesCSVRepository implements TVSeriesRepository {
    private File file;

    // Konstruktør tar inn en fil
    public TVSeriesCSVRepository(File file) {
        this.file = file;
    }

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            for (TVSeries series : listOfTVSeries) {
                String csvLine = series.getTitle() + ";" + series.getDescription() + ";" +
                    series.getReleaseDate().getYear() + ";" +
                    series.getReleaseDate().getMonthValue() + ";" +
                    series.getReleaseDate().getDayOfMonth();
                writer.println(csvLine);
            }
            System.out.println("TV-serier lagret til CSV-fil.");
        } catch (IOException e) {
            System.err.println("Feil ved skriving til CSV-fil: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        ArrayList<TVSeries> seriesList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                String title = parts[0];
                String description = parts[1];
                int year = Integer.parseInt(parts[2]);
                int month = Integer.parseInt(parts[3]);
                int day = Integer.parseInt(parts[4]);

                TVSeries series = new TVSeries(title, description, LocalDate.of(year, month, day));
                seriesList.add(series);
            }
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra CSV-fil: " + e.getMessage());
        }

        return seriesList;
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        for (TVSeries series : getAllTVSeries()) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null;
    }
}
