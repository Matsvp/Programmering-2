// Dette er deklarasjonen av klassen. Navnet på klassen må være det samme som filnavnet.
public class MoonWeight {

    // main-metoden er der programmet starter å kjøre
    public static void main(String[] args) {

        // Oppretter en Scanner for å lese input fra brukeren (tastaturet).
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Viser en melding til brukeren, og ber dem skrive inn vekten sin på jorden.
        System.out.println("Skriv inn vekten din på jorden (kg): ");

        // Leser inn brukerens input som et desimaltall og lagrer det i variabelen 'vektJorden'.
        double vektJorden = scanner.nextDouble();

        // Beregner vekten på månen ved å gange vekten på jorden med 0.166
        double vektMaanen = vektJorden * 0.166;

        // Skriver ut resultatet: vekten på månen, med forklarende tekst.
        System.out.println("Vekten din på månen er: " + vektMaanen + " kg");

        // Lukker Scanner for å frigjøre ressurser (god praksis for å unngå minnelekkasjer).
        scanner.close();
    }
}
