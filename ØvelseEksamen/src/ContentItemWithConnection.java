// En klasse som bruker ConnectionHelper til å koble og vente
public class ContentItemWithConnection {

    // Metode for å starte "prosessen"
    public void start() {
        // "try-with-resources" lukker automatisk koblingen for oss
        try (ConnectionHelper conn = new ConnectionHelper()) {
            conn.open();        // Starter koblingen
            conn.waitForEnd();  // Venter på at det blir ferdig
        } catch (Exception e) {
            // Hvis noe går galt, fanger vi feilen her
            System.out.println("Noe gikk galt med koblingen.");
        }
    }
}

