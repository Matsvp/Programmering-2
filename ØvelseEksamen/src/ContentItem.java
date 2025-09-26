
// En generell klasse for ting som har ID og kapasitet – f.eks. en buss eller video
public class ContentItem {
    private String id;         // Unik ID
    private int capacity;      // Hvor mange som kan bruke denne (plasser, visninger, osv.)

    // Konstruktør setter verdiene
    public ContentItem(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    // Henter ID-en
    public String getId() {
        return id;
    }

    // Henter kapasiteten
    public int getCapacity() {
        return capacity;
    }
}



