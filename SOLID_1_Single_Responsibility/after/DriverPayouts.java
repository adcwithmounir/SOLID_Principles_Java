package after;

import java.util.List;

public class DriverPayouts {
    private final FareCalculator fares;

    public DriverPayouts(FareCalculator fares) {
        this.fares = fares;
    }

    public void print(List<Trip> trips) {
        double total = 0;
        for (Trip trip : trips) {
            total += fares.fare(trip) * 0.80;
        }
        System.out.println("PAY  -> drivers today: " + String.format("%.2f", total) + " EUR");
    }
}
