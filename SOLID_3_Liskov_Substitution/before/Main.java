package before;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        PickupWindow standard = new PickupWindow(LocalTime.of(8, 0), LocalTime.of(8, 20));
        Scheduler.reschedule(standard, LocalTime.of(9, 0), LocalTime.of(9, 30));
        Reminder.send(standard);

        PickupWindow quick = new QuickSlot(LocalTime.of(8, 0));
        Scheduler.reschedule(quick, LocalTime.of(9, 0), LocalTime.of(9, 30));
        Reminder.send(quick);
    }
}
