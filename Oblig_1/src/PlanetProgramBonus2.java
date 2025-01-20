import java.util.ArrayList; // Import for å bruke en dynamisk liste
import java.util.Scanner;   // Import for å lese input fra brukeren

public class PlanetProgramBonus2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Oppretter Scanner for brukerinput
        ArrayList<Planet> planeter = new ArrayList<>(); // Liste for å lagre alle planetene

        boolean fortsett = true; // En boolean for å styre løkken

        while (fortsett) { // Løkken kjører så lenge brukeren vil legge til flere planeter
            
            // Be brukeren skrive inn informasjon om en planet
            System.out.print("Skriv inn navn på planeten: ");
            String navn = scanner.nextLine(); // Leser inn navnet på planeten

            System.out.print("Skriv inn radius til planeten: ");
            double radius = scanner.nextDouble(); // Leser inn radiusen

            System.out.print("Skriv inn massen til planeten: ");
            double masse = scanner.nextDouble(); // Leser inn massen
            scanner.nextLine(); // Rydder opp etter tallinput (fjerner overflødig linjeskift)
    
             // Opprett et nytt planetobjekt og legg det til i listen
             Planet planet = new Planet(navn, radius, masse);
             planeter.add(planet); // Legger planeten til i listen

               // Spør brukeren om de vil registrere flere planeter
            System.out.print("Vil du legge til en ny planet? (ja/nei): ");
            String svar = scanner.nextLine().toLowerCase(); // Leser svaret og konverterer til små bokstaver

            if (svar.equals("nei")) {
                fortsett = false; // Avslutter løkken hvis brukeren skriver "nei"
            }
        }

        // Når brukeren er ferdig, skriv ut informasjon om alle registrerte planeter
        System.out.println("\nDu registrerte følgende planeter:");
        for (Planet planet : planeter) { // Går gjennom alle planetene i listen
            skrivUtPlanetInfo(planet); // Skriver ut informasjon om hver planet
        }

        scanner.close(); // Lukker Scanner for å frigjøre ressurser
    }

    // Metoden for å skrive ut informasjon om en planet
    public static void skrivUtPlanetInfo(Planet planet) {
        System.out.println("Planeten " + planet.getNavn() +
                " har en radius på " + planet.getRadius() + " km og en masse på " +
                planet.getMasse() + " kg");
    }
}

