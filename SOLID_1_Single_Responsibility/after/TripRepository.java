package after;

public class TripRepository {
    public void save(Trip trip, double fare) {
        System.out.println("DB   <- trips: " + trip.rider() + ", " + trip.km() + " km, " + trip.minutes() + " min, "
                + String.format("%.2f", fare));
    }
}
