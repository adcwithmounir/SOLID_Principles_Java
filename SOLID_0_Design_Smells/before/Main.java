package before;

public class Main {
    public static void main(String[] args) {
        AppInbox.add(new RideRequest("Lena", "Central Station"));
        CallCenter.add(new RideRequest("Omar", "City Hospital"));

        Dispatcher.callCenterFlag = true;
        Dispatcher.smsFlag = true;
        Dispatcher.dispatch();
        Dispatcher.callCenterFlag = false;
        Dispatcher.smsFlag = false;

        Dispatcher.dispatch();
    }
}
