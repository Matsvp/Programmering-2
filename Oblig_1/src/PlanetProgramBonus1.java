import java.util.Scanner; // Importerer Scanner-klassen fra Java-biblioteket. Denne brukes for å lese inn data fra brukeren via terminalen.

public class PlanetProgramBonus1 {

    public static void main(String[] args) {

        // 1. OPPRETTER SCANNER FOR BRUKERINPUT
        // Scanner brukes til å lese inn data fra tastaturet. System.in betyr "les input fra terminalen".
        Scanner scanner = new Scanner(System.in);

        // 2. BER OM PLANETENS NAVN
        // Skriver en melding til brukeren for å be om navnet på planeten
        System.out.print("Skriv inn navn på planeten: ");
        // Leser inn hele linjen brukeren skriver (inkludert mellomrom) og lagrer det i variabelen 'navn'.
        String navn = scanner.nextLine(); // F.eks. "Saturn"

        // 3. BER OM PLANETENS RADIUS
        // Skriver en melding til brukeren for å be om radiusen til planeten
        System.out.print("Skriv inn radius til planeten: ");
        // Leser inn neste tall som brukeren skriver og lagrer det i variabelen 'radius'.
        // Dette er et desimaltall (double), som kan håndtere store og små tall med desimaler.
        double radius = scanner.nextDouble(); // F.eks. 58232

        // 4. BER OM PLANETENS MASSE
        // Skriver en melding til brukeren for å be om massen til planeten
        System.out.print("Skriv inn massen til planeten: ");
        // Leser inn neste tall som brukeren skriver, lagrer det i variabelen 'masse'.
        // Masse er også et desimaltall (double), som kan håndtere svært store tall som eksponenter.
        double masse = scanner.nextDouble(); // F.eks. 5.683E26

        // 5. OPPRETTER PLANET-OBJEKTET
        // Oppretter et objekt av klassen 'Planet'. Vi bruker konstruktøren til Planet-klassen,
        // som tar tre parametere: navn (String), radius (double), og masse (double).
        // Dataen fra brukeren (navn, radius, masse) sendes inn for å opprette et spesifikt planetobjekt.
        Planet planet = new Planet(navn, radius, masse);

        // 6. SKRIVER UT INFORMASJON OM PLANETEN
        // Kaller metoden 'skrivUtPlanetInfo' og sender inn planetobjektet vi nettopp opprettet.
        // Denne metoden henter ut data om planeten og skriver det ut på en lesbar måte.
        skrivUtPlanetInfo(planet);

        // 7. LUKKER SCANNER
        // Når vi er ferdig med å bruke Scanner, lukker vi den. Dette er god praksis for å
        // frigjøre ressurser og unngå at programmet holder Scanner åpen unødvendig.
        scanner.close();
    }

    // METODEN FOR Å SKRIVE UT PLANETINFORMASJON
    // Denne metoden tar inn et objekt av typen 'Planet' som parameter. Den henter ut data
    // fra objektet ved å bruke "get"-metoder og skriver det ut i et formatert tekst.
    public static void skrivUtPlanetInfo(Planet planet) {
        // 'planet.getNavn()' henter navnet på planeten
        // 'planet.getRadius()' henter radiusen på planeten
        // 'planet.getMasse()' henter massen på planeten
        System.out.println("Planeten " + planet.getNavn() + // Henter planetens navn
                " har en radius på " + planet.getRadius() + " km og en masse på " + // Henter planetens radius
                planet.getMasse() + " kg"); // Henter planetens masse
    }
}


