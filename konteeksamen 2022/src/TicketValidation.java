// ====== Oppgave 3.3 ======
public interface TicketValidation {
    boolean checkTicketValidity(Ticket ticket);
}

// Bus implementerer nå interfacet
public class Bus extends CollectiveTransportUnit implements TicketValidation {
    private String modelName;
    private Route route;
    private TicketAuthenticator ticketAuthenticator;

    public boolean checkTicketValidity(Ticket ticket) {
        // Implementasjon kommer i oppgave 3.4
        return false;
    }
}
