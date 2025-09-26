
// Denne klassen representerer et innhold, for eksempel en video eller billett
public class Content {
    private String title;      // Tittel på innholdet
    private double length;     // Hvor langt det er, for eksempel i minutter

    // Konstruktøren setter verdiene når vi lager et nytt Content-objekt
    public Content(String title, double length) {
        this.title = title;
        this.length = length;
    }

    // En "getter" – henter tittelen
    public String getTitle() {
        return title;
    }

    // En "setter" – lar oss endre tittelen
    public void setTitle(String title) {
        this.title = title;
    }

    // Lager en tekst som beskriver objektet når vi skriver det ut
    @Override
    public String toString() {
        return "Content: " + title + ", Length: " + length;
    }
}



