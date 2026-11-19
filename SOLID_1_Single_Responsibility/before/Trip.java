package before;

public class Trip {
    private final String rider;
    private final double km;
    private final int minutes;

    public Trip(String rider, double km, int minutes) {
        this.rider = rider;
        this.km = km;
        this.minutes = minutes;
    }

    public double fare() {
        double raw = 2.50 + km * 1.20 + minutes * 0.30;
        return Math.round(raw * 100) / 100.0;
    }

    public String receipt() {
        return "Thanks " + rider + "! " + km + " km, " + minutes + " min. Total: "
                + String.format("%.2f", fare()) + " EUR";
    }

    public void save() {
        System.out.println("DB   <- trips: " + rider + ", " + km + " km, " + minutes + " min, "
                + String.format("%.2f", fare()));
    }
}
