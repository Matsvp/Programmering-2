import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import no.hiof.oleedvao.oblig4.model.Episode;
import no.hiof.oleedvao.oblig4.model.Person;
import no.hiof.oleedvao.oblig4.model.Role;
import no.hiof.oleedvao.oblig4.model.TVSeries;
import no.hiof.oleedvao.oblig4.repository.TVSeriesRepository;

public class TVSeriesDataRepository implements TVSeriesRepository {
    private List<TVSeries> allTvSeries;

    public TVSeriesDataRepository() {
        allTvSeries = new ArrayList<>();

        // regissør og roller
        Person vinceGilligan = new Person("Vince", "Gilligan");
        Person bryanCranston = new Person("Bryan", "Cranston");
        Person aaronPaul = new Person("Aaron", "Paul");
        Person deanNorris = new Person("Dean", "Norris");

        Role walterWhite = new Role("Walter", "White", bryanCranston);
        Role jessePinkman = new Role("Jesse", "Pinkman", aaronPaul);
        Role hankShrader = new Role("Hank", "Shrader", deanNorris);

        // episoder
        Episode pilot = new Episode("Pilot", 1, 1);
        pilot.setDirector(vinceGilligan);
        pilot.addToRoles(walterWhite);
        pilot.addToRoles(jessePinkman);

        Episode catsInTheBag = new Episode("Cat's in the Bag", 2, 1);
        catsInTheBag.addToRoles(walterWhite);
        catsInTheBag.addToRoles(jessePinkman);
        catsInTheBag.addToRoles(hankShrader);

        // serie
        TVSeries breakingBad = new TVSeries("Breaking Bad", "Drug manufacturer/dealer adventures", LocalDate.of(2008, 1, 20));
        breakingBad.addEpisode(pilot);
        breakingBad.addEpisode(catsInTheBag);
        allTvSeries.add(breakingBad);
    }

    @Override
    public List<TVSeries> getAllTVSeries() {
        return allTvSeries;
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        for (TVSeries series : allTvSeries) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null;
    }
    @Override
    public void addTVSeries(TVSeries tvSeries) {
    allTvSeries.add(tvSeries);
}
}

