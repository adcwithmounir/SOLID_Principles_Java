package before;

import java.util.List;

public class DriverPayouts {
    public static void print(List<Trip> trips) {
        double total = 0;
        for (Trip trip : trips) {
            total += trip.fare() * 0.80;
        }
        System.out.println("PAY  -> drivers today: " + String.format("%.2f", total) + " EUR");
    }
}
