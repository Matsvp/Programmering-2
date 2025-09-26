//====== Oppgave 3.4 ======
public boolean checkTicketValidity(Ticket ticket) {
    // Sjekk 1: Autentisitet
    if (!ticketAuthenticator.checkTicketAuthenticity(ticket)) {
        return false;
    }

    // Sjekk 2: Er det en PremiumTicket? Da er den alltid gyldig
    if (ticket instanceof PremiumTicket) {
        return true;
    }

    // Sjekk 3: Hvis det er RouteTicket, må ruten stemme
    if (ticket instanceof RouteTicket) {
        RouteTicket rt = (RouteTicket) ticket;
        return rt.getRoute().equals(this.route);
    }

    return false; // Hvis ikke gyldig
}
