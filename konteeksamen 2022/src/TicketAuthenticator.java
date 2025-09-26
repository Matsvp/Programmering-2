// ====== Oppgave 3.5 ======
public class TicketAuthenticator {
    public boolean checkTicketAuthenticity(Ticket ticket) {
        try (DatabaseConnection db = new DatabaseConnection()) {
            db.openConnection(); // kobler til databasen
            return db.checkTicket(ticket); // sjekker om billetten er ekte
        } catch (DatabaseException e) {
            System.out.println("Oops! Something when wrong with the database communication.");
            return false;
        }
    }
}

