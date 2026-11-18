package after;

public class Dispatcher {

    public void dispatch(RequestSource source) {
        RideRequest request;
        while ((request = source.next()) != null) {
            DriverPush.send(request);
        }
    }
}
