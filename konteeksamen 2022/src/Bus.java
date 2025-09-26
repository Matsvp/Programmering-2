// ====== Oppgave 3.1.1 ======
// Klassen representerer en buss i kollektivsystemet
public class Bus {
    // Instansvariabler (private = innkapsling, beskytter data)
    private String id;
    private String modelName;
    private int maxCapacity;
    private Route route;
    private TicketAuthenticator ticketAuthenticator;

    // Full konstruktør: Alle verdier settes ved opprettelse
    public Bus(String id, String modelName, int maxCapacity, Route route, TicketAuthenticator ticketAuthenticator) {
        this.id = id;
        this.modelName = modelName;
        this.maxCapacity = maxCapacity;
        this.route = route;
        this.ticketAuthenticator = ticketAuthenticator;
    }

    // Delvis konstruktør: route og authenticator settes senere
    public Bus(String id, String modelName, int maxCapacity) {
        this.id = id;
        this.modelName = modelName;
        this.maxCapacity = maxCapacity;
        this.route = null; // tomt inntil videre
        this.ticketAuthenticator = null;
    }

    // Getter og setter for id (de andre er like, men utelatt)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // toString()-lignende metode for utskrift
    public String getBusInfo() {
        return "Bus model: " + modelName + ", Number of seats: " + maxCapacity;
    }
}

