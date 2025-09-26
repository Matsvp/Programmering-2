import java.util.List;

public class Channel {
    // Navn på kanalen
    String name;

    // Liste over videoer og/eller livestreams som tilhører kanalen
    List<VisualMedia> visualMedias;

    // Totalt antall views fra videoene i kanalen
    int videoViews;

    // Metode som oppdaterer total views ved å summere views fra alle Video-objektene
    public void updateVideoViews() {
        int total = 0;

        // Går gjennom alle elementer i visualMedias-listen
        for (VisualMedia media : visualMedias) {
            // Sjekker om objektet faktisk er en Video
            if (media instanceof Video) {
                // Caster til Video og henter views
                Video video = (Video) media;
                total += video.getViews();
            }
        }

        // Oppdaterer videoViews med summen
        videoViews = total;
    }
}


