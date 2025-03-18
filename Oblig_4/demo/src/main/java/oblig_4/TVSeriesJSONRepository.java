package oblig_4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.util.ArrayList;

public class TVSeriesJSONRepository implements TVSeriesRepository {
    private File file;
    private ObjectMapper objectMapper;

    // Konstruktør tar inn en fil og setter opp ObjectMapper
    public TVSeriesJSONRepository(File file) {
        this.file = file;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule()); // For å håndtere LocalDate
    }

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try {
            objectMapper.writeValue(file, listOfTVSeries);
            System.out.println("TV-serier lagret til JSON-fil.");
        } catch (Exception e) {
            System.err.println("Feil ved skriving til JSON-fil: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        try {
            return objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, TVSeries.class));
        } catch (Exception e) {
            System.err.println("Feil ved lesing fra JSON-fil: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        for (TVSeries series : getAllTVSeries()) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null; // Returnerer null hvis serien ikke finnes
    }
}


