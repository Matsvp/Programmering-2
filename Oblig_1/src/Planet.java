// Klassen Planet definerer hva en planet er og hvilke data den har
public class Planet {

    // Instansvariabler: lagrer informasjon om planeten
    private String navn;   // Navnet på planeten (f.eks. "Mars")
    private double radius; // Radiusen til planeten (i km)
    private double masse;  // Massen til planeten (i kg)

    // Konstruktør: brukes til å lage et nytt Planet-objekt
    // Tar inn tre verdier: navn, radius og masse, og lagrer dem i instansvariablene
    public Planet(String navn, double radius, double masse) {
        this.navn = navn;       // Setter planetens navn
        this.radius = radius;   // Setter planetens radius
        this.masse = masse;     // Setter planetens masse
    }

    // Get-metode for å hente planetens navn
    public String getNavn() {
        return navn; // Returnerer planetens navn
    }

    // Set-metode for å endre planetens navn
    public void setNavn(String navn) {
        this.navn = navn; // Oppdaterer planetens navn
    }

    // Get-metode for å hente planetens radius
    public double getRadius() {
        return radius; // Returnerer planetens radius
    }

    // Set-metode for å endre planetens radius
    public void setRadius(double radius) {
        this.radius = radius; // Oppdaterer planetens radius
    }

    // Get-metode for å hente planetens masse
    public double getMasse() {
        return masse; // Returnerer planetens masse
    }

    // Set-metode for å endre planetens masse
    public void setMasse(double masse) {
        this.masse = masse; // Oppdaterer planetens masse
    }
}

