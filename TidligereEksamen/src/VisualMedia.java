// VisualMedia er en abstrakt klasse som også implementerer Comparable
public abstract class VisualMedia implements Comparable<VisualMedia> {
    private String title;
    private double lengthInMinutes;
    private Channel channel;

    public VisualMedia(String title, double lengthInMinutes, Channel channel) {
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
        this.channel = channel;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    // compareTo brukes når vi vil sortere lister med VisualMedia-objekter
    @Override
    public int compareTo(VisualMedia other) {
        // Vi sammenligner lengde – MEN i synkende rekkefølge
        // Derfor bruker vi other - this
        return Double.compare(other.lengthInMinutes, this.lengthInMinutes);
    }

    // Ekstra: Hvis du vil sortere i stigende rekkefølge, bytt om rekkefølgen:
    // return Double.compare(this.lengthInMinutes, other.lengthInMinutes);
}

