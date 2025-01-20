import java.util.ArrayList;
import java.util.Scanner;

public class PlanetProgramBonus3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Planet> planeter = new ArrayList<>();
        boolean fortsett = true;

        while (fortsett) {
            // Hovedmeny
            System.out.println("\nHva vil du gjøre?");
            System.out.println("1. Registrere en ny planet");
            System.out.println("2. Liste ut alle planeter");
            System.out.println("3. Oppdatere en planet");
            System.out.println("4. Slette en planet");
            System.out.println("5. Avslutte programmet");
            System.out.print("Velg et alternativ (1-5): ");

            int valg = scanner.nextInt();
            scanner.nextLine(); // Fjern overflødig linjeskift

            switch (valg) {
                case 1 -> registrerPlanet(planeter, scanner);
                case 2 -> listUtPlaneter(planeter);
                case 3 -> oppdaterEllerSlettPlanet(planeter, scanner, true);
                case 4 -> oppdaterEllerSlettPlanet(planeter, scanner, false);
                case 5 -> {
                    System.out.println("Avslutter programmet. Ha en fin dag!");
                    fortsett = false;
                }
                default -> System.out.println("Ugyldig valg. Prøv igjen.");
            }
        }
        scanner.close();
    }

    // Registrer en ny planet
    private static void registrerPlanet(ArrayList<Planet> planeter, Scanner scanner) {
        System.out.print("Skriv inn navn på planeten: ");
        String navn = scanner.nextLine();

        System.out.print("Skriv inn radius til planeten: ");
        double radius = scanner.nextDouble();

        System.out.print("Skriv inn massen til planeten: ");
        double masse = scanner.nextDouble();
        scanner.nextLine();

        planeter.add(new Planet(navn, radius, masse));
        System.out.println("Planeten " + navn + " er registrert.");
    }

    // Liste ut alle registrerte planeter
    private static void listUtPlaneter(ArrayList<Planet> planeter) {
        if (planeter.isEmpty()) {
            System.out.println("Ingen planeter er registrert ennå.");
        } else {
            System.out.println("Registrerte planeter:");
            for (int i = 0; i < planeter.size(); i++) {
                Planet planet = planeter.get(i);
                System.out.println((i + 1) + ". " + planet.getNavn() +
                        " - Radius: " + planet.getRadius() + " km, Masse: " + planet.getMasse() + " kg");
            }
        }
    }

    // Felles metode for oppdatering eller sletting av en planet
    private static void oppdaterEllerSlettPlanet(ArrayList<Planet> planeter, Scanner scanner, boolean oppdater) {
        if (planeter.isEmpty()) {
            System.out.println("Ingen planeter å " + (oppdater ? "oppdatere." : "slette."));
            return;
        }

        listUtPlaneter(planeter);
        System.out.print("Velg nummeret til planeten du vil " + (oppdater ? "oppdatere: " : "slette: "));
        int indeks = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indeks >= 0 && indeks < planeter.size()) {
            if (oppdater) {
                Planet planet = planeter.get(indeks);

                System.out.print("Skriv inn nytt navn for planeten (nåværende: " + planet.getNavn() + "): ");
                String nyttNavn = scanner.nextLine();
                if (!nyttNavn.isEmpty()) planet.setNavn(nyttNavn);

                System.out.print("Skriv inn ny radius for planeten (nåværende: " + planet.getRadius() + "): ");
                double nyRadius = scanner.nextDouble();

                System.out.print("Skriv inn ny masse for planeten (nåværende: " + planet.getMasse() + "): ");
                double nyMasse = scanner.nextDouble();
                scanner.nextLine();

                planet.setRadius(nyRadius);
                planet.setMasse(nyMasse);

                System.out.println("Informasjonen om planeten er oppdatert.");
            } else {
                Planet fjernetPlanet = planeter.remove(indeks);
                System.out.println("Planeten " + fjernetPlanet.getNavn() + " er slettet.");
            }
        } else {
            System.out.println("Ugyldig valg. Ingen endring utført.");
        }
    }
}



