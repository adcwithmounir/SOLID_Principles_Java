package after;

public class FareCalculator {
    public double fare(Trip trip) {
        double raw = 2.50 + trip.km() * 1.20 + trip.minutes() * 0.30;
        return Math.round(raw * 100) / 100.0;
    }
}
