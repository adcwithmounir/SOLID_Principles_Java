package after;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FareCalculator fares = new FareCalculator();
        Receipt receipt = new Receipt(fares);
        TripRepository repository = new TripRepository();

        List<Trip> trips = List.of(new Trip("Lena", 8.0, 15), new Trip("Sam", 12.5, 22));

        for (Trip trip : trips) {
            repository.save(trip, fares.fare(trip));
            System.out.println("APP  -> " + receipt.text(trip));
        }
        new DriverPayouts(fares).print(trips);
    }
}
