// Klassen hvor programmet starter
public class PlanetProgram {

    // Main-metoden er startpunktet for programmet
    public static void main(String[] args) {

        // Opprettelse av planet-objekter ved hjelp av konstruktøren fra Planet-klassen
        // Her gir vi hvert objekt et navn, en radius og en masse
        Planet mars = new Planet("Mars", 3389.5, 6.39E23); // Lager planeten Mars
        Planet jupiter = new Planet("Jupiter", 69911, 1.90E27); // Lager planeten Jupiter
        Planet venus = new Planet("Venus", 6051.8, 4.87E24); // Lager planeten Venus

        // Kaller metoden 'skrivUtPlanetInfo' for å skrive ut informasjon om hver planet
        skrivUtPlanetInfo(mars);    // Skriver ut informasjon om Mars
        skrivUtPlanetInfo(jupiter); // Skriver ut informasjon om Jupiter
        skrivUtPlanetInfo(venus);   // Skriver ut informasjon om Venus
    }

    // Metode for å skrive ut informasjon om en planet
    // Denne tar et Planet-objekt som argument
    public static void skrivUtPlanetInfo(Planet planet) {
        // Henter planetens navn, radius og masse ved hjelp av get-metodene
        // Skriver ut informasjonen i ønsket format
        System.out.println("Planeten " + planet.getNavn() +
                " har en radius på " + planet.getRadius() + " km og en masse på " +
                planet.getMasse() + " kg");
    }
}
