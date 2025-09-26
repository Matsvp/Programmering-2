public class ContentTracker {
    // Static betyr at denne variabelen gjelder for ALLE ContentTracker-objekter
    private static int total = 0;

    // Hver gang vi lager et nytt objekt, øker vi total med 1
    public ContentTracker() {
        total++;
    }

    // Denne metoden skriver ut hvor mange vi har laget
    public static void printTotal() {
        System.out.println("Total content created: " + total);
    }
}

