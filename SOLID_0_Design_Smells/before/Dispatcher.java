package before;

public class Dispatcher {

    // remember to reset these flags
    public static boolean callCenterFlag = false;
    public static boolean smsFlag = false;

    public static void dispatch() {
        RideRequest request;
        while ((request = callCenterFlag ? CallCenter.next() : AppInbox.next()) != null) {
            if (smsFlag) DriverSms.send(request);
            else DriverPush.send(request);
        }
    }
}
