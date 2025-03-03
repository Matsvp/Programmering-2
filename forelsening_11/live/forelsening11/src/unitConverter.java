public class unitConverter {
    public double convert(double value, String fromUnit, String toUnit) {
        // Enkel konverteringslogikk for eksempel
        if (fromUnit.equals("meters") && toUnit.equals("kilometers")) {
            return value / 1000;
        } else if (fromUnit.equals("kilometers") && toUnit.equals("meters")) {
            return value * 1000;
        }
        // Legg til flere konverteringer etter behov
        return value;
    }
}
