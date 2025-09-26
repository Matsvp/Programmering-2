

// Denne klassen følger regelen fra Validatable
public class ContentValidator implements Validatable {

    // Vi lager metoden som er påkrevd av Validatable
    @Override
    public boolean validate(Object obj) {
        // Her sier vi at et objekt er gyldig så lenge det ikke er null
        return obj != null;
    }
}


