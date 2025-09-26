/*
===============================
 EKSAMENSOVERSIKT – A4-HJELP
===============================

📌 KLASSER OG OBJEKTER
-----------------------
class Person {
    private String navn;
    public Person(String navn) {
        this.navn = navn;
    }
    public String getNavn() { return navn; }
    public void setNavn(String navn) { this.navn = navn; }
}
📌 MAIN-METODE
-----------------------
public static void main(String[] args) {
    Person p = new Person("Ola");
    p.setNavn("Kari");
    System.out.println(p.getNavn());
}
📌 KONSTRUKTØR, GET/SET
-----------------------
class Video {
    private String title;
    public Video(String title) {
        this.title = title;
    }
    public String getTitle() { return title; }
    public void setTitle(String t) { this.title = t; }
}
📌 INTERFACE + IMPLEMENTASJON
-----------------------
interface TicketValidation {
    boolean checkTicketValidity(Ticket t);
}

class Bus implements TicketValidation {
    public boolean checkTicketValidity(Ticket t) {
        return true;
    }
}
📌 ABSTRAKT KLASSE OG METODE
-----------------------
abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() { System.out.println("Voff"); }
}
📌 STATIC – FELLES FOR ALLE OBJEKTER
-----------------------
class Video {
    private static int total = 0;
    public Video() { total++; }
    public static void printTotal() {
        System.out.println("Total: " + total);
    }
}
📌 COMPARETO – SORTERING
-----------------------
public class VisualMedia implements Comparable<VisualMedia> {
    private double length;
    public int compareTo(VisualMedia other) {
        return Double.compare(other.length, this.length); // synkende
    }
}
📌 TRY-CATCH – EXCEPTIONS
-----------------------
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Feil: kan ikke dele på null.");
}
📌 TRY-WITH-RESOURCES (AutoCloseable)
-----------------------
try (DatabaseConnection db = new DatabaseConnection()) {
    db.openConnection();
    return db.checkTicket(ticket);
} catch (DatabaseException e) {
    System.out.println("Oops! Something went wrong.");
    return false;
}
📌 JSON OG API
-----------------------
GET /api/users
POST /api/products

Eksempel på JSON:
{
  "navn": "Ola",
  "alder": 23
}
📌 TYPISK KLASSESTRUKTUR PÅ EKSAMEN
-----------------------
public class Video extends VisualMedia {
    private static int total;
    private int views;
    public int getViews() { return views; }
}
public class Channel {
    private List<VisualMedia> media;
    private int videoViews;

    public void updateVideoViews() {
        int sum = 0;
        for (VisualMedia v : media) {
            if (v instanceof Video) {
                sum += ((Video)v).getViews();
            }
        }
        this.videoViews = sum;
    }
}
📌 HUSKEREGLER
-----------------------
- Felles funksjonalitet? → Bruk superklasse eller abstract
- Ulik oppførsel i forskjellige klasser? → Bruk interface
- Feil kan skje? → Bruk try-catch
- Noe felles for alle objekter? → Bruk static
- Bruk compareTo hvis du skal kunne sortere

===============================
 DU HAR NÅ ALT PÅ ETT STED!
===============================
*/







