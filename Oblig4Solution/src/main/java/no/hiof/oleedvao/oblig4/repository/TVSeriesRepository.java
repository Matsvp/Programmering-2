package no.hiof.oleedvao.oblig4.repository;

import no.hiof.oleedvao.oblig4.model.TVSeries;

import java.util.ArrayList;

public interface TVSeriesRepository {

    ArrayList<TVSeries> getAllTVSeries();
    TVSeries getTVSeries(String title);
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);
    void addTVSeries(TVSeries tvSeries);
    
}
