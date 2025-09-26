// ====== Oppgave 3.1.2 ======
// Felles superklasse for all kollektiv transport
public class CollectiveTransportUnit {
    private String id;
    private int maxCapacity;

    public CollectiveTransportUnit(String id, int maxCapacity) {
        this.id = id;
        this.maxCapacity = maxCapacity;
    }
    // Gettere og settere kan antas å eksistere
}

// Nå lar vi Bus arve fra denne klassen:
// public class Bus extends CollectiveTransportUnit {
//     ... resten beholdes likt, men fjerner id og maxCapacity fra Bus
// }
