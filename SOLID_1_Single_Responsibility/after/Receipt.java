package after;

public class Receipt {
    private final FareCalculator fares;

    public Receipt(FareCalculator fares) {
        this.fares = fares;
    }

    public String text(Trip trip) {
        double total = Math.ceil(fares.fare(trip));
        return "Thanks " + trip.rider() + "! " + trip.km() + " km, " + trip.minutes() + " min. Total: "
                + String.format("%.2f", total) + " EUR";
    }
}
