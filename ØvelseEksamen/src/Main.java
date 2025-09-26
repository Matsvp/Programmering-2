

// Hovedklassen som tester alt sammen
public class Main {
    public static void main(String[] args) {
        // Tester validatoren
        ContentValidator validator = new ContentValidator();
        System.out.println("Er 'Test' gyldig? " + validator.validate("Test")); // true

        // Lager en SubContent og skriver ut navnet
        SubContent sc = new SubContent("id123", 100, "MinVideo");
        System.out.println("SubContent-navn: " + sc.getName());

        // Starter kobling via helper
        ContentItemWithConnection item = new ContentItemWithConnection();
        item.start();
    }
}

