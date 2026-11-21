package before;

public class Reminder {
    public static void send(PickupWindow window) {
        System.out.println("Your driver arrives between " + window.from() + " and " + window.to()
                + " (" + window.minutes() + " min)");
    }
}
