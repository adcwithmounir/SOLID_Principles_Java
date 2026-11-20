package before;

public class FareCalculator {
    public static double fare(RideType type, double km, int minutes) {
        return switch (type) {
            case ECONOMY -> 2.50 + km * 1.20 + minutes * 0.30;
            case COMFORT -> 4.00 + km * 1.60 + minutes * 0.40;
            case XL -> 5.00 + km * 2.00 + minutes * 0.50;
        };
    }
}
