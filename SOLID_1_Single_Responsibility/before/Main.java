package before;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Trip> trips = List.of(new Trip("Lena", 8.0, 15), new Trip("Sam", 12.5, 22));

        for (Trip trip : trips) {
            trip.save();
            System.out.println("APP  -> " + trip.receipt());
        }
        DriverPayouts.print(trips);
    }
}
