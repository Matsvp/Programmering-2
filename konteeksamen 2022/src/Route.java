// ====== Oppgave 3.2 ======
import java.util.List;

public class Route {
    private List<BusStop> stops; // sekvens av bussholdeplasser
// Konstruktør som tar inn en liste med bussholdeplasser
    public Route(List<BusStop> stops) {
        this.stops = stops;
    }
// Metode som beregner og returnerer den totale lengden på ruten i kilometer
    public double calculateRouteLength() {
        double total = 0.0;

// Vi må gå gjennom alle stoppene parvis (f.eks. [0-1], [1-2], [2-3]...)
// Derfor bruker vi en vanlig for-løkke – vi går til nest siste stopp (size() - 1)
        for (int i = 0; i < stops.size() - 1; i++) {
            // Henter nåværende og neste busstopp
            BusStop current = stops.get(i);
            BusStop next = stops.get(i + 1);
            // GPSService har en ferdig metode for å finne avstanden mellom to stopp
            // Legger til denne avstanden i totalen total +=
            total += GPSService.distanceBetweenBusStops(current, next);
        }

        return total;
    }
}