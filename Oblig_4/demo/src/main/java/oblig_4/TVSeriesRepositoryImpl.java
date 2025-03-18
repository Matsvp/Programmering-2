package oblig_4;

import java.util.ArrayList;

public class TVSeriesRepositoryImpl implements TVSeriesRepository {
    private ArrayList<TVSeries> tvSeriesList = new ArrayList<>();

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        tvSeriesList.addAll(listOfTVSeries);
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        return tvSeriesList;
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        for (TVSeries series : tvSeriesList) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null; // Returnerer null hvis serien ikke finnes
    }
}

