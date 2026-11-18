package before;

public class DriverPush {
    public static void send(RideRequest request) {
        System.out.println("PUSH -> driver: pick up " + request.rider() + " at " + request.pickup());
    }
}
