package no.hiof.oleedvao.oblig4;

import java.time.LocalDate;

import io.javalin.Javalin;
import io.javalin.community.plugin.vue.VuePlugin;
import io.javalin.http.staticfiles.Location;
import no.hiof.oleedvao.oblig4.controller.TVSeriesController;
import no.hiof.oleedvao.oblig4.repository.TVSeriesDataRepository;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.plugins.register(new VuePlugin());
            config.staticFiles.add(staticFileConfig -> {
                staticFileConfig.directory = "public";
                staticFileConfig.location = Location.CLASSPATH;
            });
        }).start(8080);

        // 1. Opprett repository
        TVSeriesDataRepository repository = new TVSeriesDataRepository();

        // 2. Opprett controller
        TVSeriesController tvSeriesController = new TVSeriesController(repository);

        // 3. Koble API-ruter til controller-metoder
        app.get("/api/tvseries", tvSeriesController::getAllTVSeries);
        app.get("/api/tvseries/{tvseries-name}", tvSeriesController::getTVSeriesByTitle);
        app.post("/api/add-tvseries", tvSeriesController::addTVSeries);

        // 4. Vue-ruter
        app.vue("/", vue -> vue.component("home-page"));
        app.vue("/tvseries", vue -> vue.component("tvseries-overview"));
        app.vue("/tvseries/{tvseries-name}", vue -> vue.component("tvseries-detail"));
        app.vue("/add-tvseries", vue -> vue.component("add-tvseries"));
    }
}

