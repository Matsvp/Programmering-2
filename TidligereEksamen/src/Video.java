public class Video {
    // Instansvariabler – spesifikke for hvert objekt
    private String title;
    private double lengthInMinutes;
    private int views;
    private Channel channel;

    // Statisk variabel – deles av ALLE Video-objekter, derfor brukes "static"
    private static int totalNumberOfVideos = 0;

    // Konstruktør som også øker telleren for hver gang en Video blir laget
    public Video(String title, double lengthInMinutes, int views, Channel channel) {
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
        this.views = views;
        this.channel = channel;

        // Øker statisk telleren når en ny video lages
        totalNumberOfVideos++;
    }

    // Statisk metode som skriver ut hvor mange videoer som er laget totalt
    public static void printTotalNumberOfVideos() {
        System.out.println("The total number of videos created is " + totalNumberOfVideos);
    }
}


