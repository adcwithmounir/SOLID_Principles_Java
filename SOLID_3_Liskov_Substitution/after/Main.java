package after;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        PickupWindow standard = new PickupWindow(LocalTime.of(8, 0), LocalTime.of(8, 20));
        Scheduler.reschedule(standard, LocalTime.of(9, 0), LocalTime.of(9, 30));
        Reminder.send(standard);

        QuickSlot quick = new QuickSlot(LocalTime.of(8, 0));
        quick.startAt(LocalTime.of(9, 0));
        Reminder.send(quick);

        Reminder.send(new FlightWindow(LocalTime.of(10, 15)));
    }
}
