package after;

public class Reminder {
    public static void send(TimeWindow window) {
        System.out.println("Your driver arrives between " + window.from() + " and " + window.to()
                + " (" + window.minutes() + " min)");
    }
}
