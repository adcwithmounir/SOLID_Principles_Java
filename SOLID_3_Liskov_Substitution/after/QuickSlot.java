package after;

import java.time.LocalTime;

public class QuickSlot implements TimeWindow {
    private static final int LENGTH = 10;
    private LocalTime from;

    public QuickSlot(LocalTime from) {
        this.from = from;
    }

    public LocalTime from() { return from; }
    public LocalTime to() { return from.plusMinutes(LENGTH); }

    public void startAt(LocalTime from) {
        this.from = from;
    }
}
