package oblig_4;

import java.util.ArrayList;

public interface TVSeriesRepository {
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);
    ArrayList<TVSeries> getAllTVSeries();
    TVSeries getTVSeriesByTitle(String title);
}

