

// En hjelpeklasse som simulerer en kobling til en ekstern tjeneste (database, livestream, osv.)
public class ConnectionHelper implements AutoCloseable {

    // Åpner koblingen
    public void open() {
        System.out.println("Kobler til...");
    }

    // Simulerer venting på at noe blir ferdig (f.eks. stream)
    public void waitForEnd() {
        System.out.println("Venter på at det blir ferdig...");
    }

    // Denne metoden kalles automatisk når koblingen skal lukkes
    @Override
    public void close() {
        System.out.println("Kobling lukket.");
    }
}



