public class LiveStream {
    // For enkelhet antar vi at nødvendige variabler og konstruktør finnes

    public void startStream() {
        // Bruker try-with-resources for å automatisk lukke koblingen etter bruk
        try (LiveStreamConnection connection = new LiveStreamConnection(this)) {
            // Prøver å åpne forbindelsen – kan kaste OpenConnectionException
            connection.openConnection();

            // Venter til streamen er ferdig – kan kaste ConnectionException
            connection.awaitStreamEnd();

        } catch (OpenConnectionException e) {
            // Hvis det ikke går an å starte streamen
            System.out.println("Could not start the livestream");

        } catch (ConnectionException e) {
            // Hvis det skjer noe annet galt med koblingen
            System.out.println("Something went wrong with the connection");
        }
    }
}



