package after;

public class Main {
    public static void main(String[] args) {
        AppInbox app = new AppInbox();
        app.add(new RideRequest("Lena", "Central Station"));

        CallCenter callCenter = new CallCenter();
        callCenter.takeCall("Omar", "City Hospital");

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatch(callCenter);
        dispatcher.dispatch(app);
    }
}
