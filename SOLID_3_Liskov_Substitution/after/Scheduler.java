package after;

import java.time.LocalTime;

public class Scheduler {
    public static void reschedule(PickupWindow window, LocalTime from, LocalTime to) {
        window.setFrom(from);
        window.setTo(to);
    }
}
