

// Denne klassen ARVER fra ContentItem – den får med ID og kapasitet
public class SubContent extends ContentItem {
    private String name; // Ekstra verdi spesifikk for SubContent

    // Konstruktør som sender ID og kapasitet til superklassen (ContentItem),
    // og setter egen verdi: name
    public SubContent(String id, int capacity, String name) {
        super(id, capacity); // Super = foreldreklasse
        this.name = name;
    }

    // Henter navnet
    public String getName() {
        return name;
    }
}


