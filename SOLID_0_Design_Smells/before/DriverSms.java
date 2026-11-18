package before;

public class DriverSms {
    public static void send(RideRequest request) {
        System.out.println("SMS  -> driver: pick up " + request.rider() + " at " + request.pickup());
    }
}
