package no.hiof.oleedvao.oblig4.controller;

import io.javalin.http.Context;
import no.hiof.oleedvao.oblig4.repository.TVSeriesRepository;
import no.hiof.oleedvao.oblig4.model.TVSeries;

import java.time.LocalDate;

public class TVSeriesController {
    
    private TVSeriesRepository repository;

    // Konstruktør tar imot repository-objektet
    public TVSeriesController(TVSeriesRepository repository) {
        this.repository = repository;
    }

    public void getAllTVSeries(Context ctx) {
        ctx.json(repository.getAllTVSeries());
    }

    public void getTVSeriesByTitle(Context ctx) {
        String tvseriesName = ctx.pathParam("tvseries-name");
        ctx.json(repository.getTVSeriesByTitle(tvseriesName));
    }
    
    public void addTVSeries(Context ctx) {
        String title = ctx.formParam("title");
        String description = ctx.formParam("description");
        String yearStr = ctx.formParam("release-date-year");
        String monthStr = ctx.formParam("release-date-month");
        String dayStr = ctx.formParam("release-date-day");
    
        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);
    
        LocalDate releaseDate = LocalDate.of(year, month, day);
        TVSeries newSeries = new TVSeries(title, description, releaseDate);
        repository.addTVSeries(newSeries);
    
        
        ctx.redirect("/tvseries/" + title);
    }
    
}
