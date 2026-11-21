package after;

import java.time.LocalTime;

public class PickupWindow implements TimeWindow {
    private LocalTime from;
    private LocalTime to;

    public PickupWindow(LocalTime from, LocalTime to) {
        this.from = from;
        this.to = to;
    }

    public LocalTime from() { return from; }
    public LocalTime to() { return to; }

    // Postcondition: from() == from, and to() is unchanged.
    public void setFrom(LocalTime from) { this.from = from; }
    // Postcondition: to() == to, and from() is unchanged.
    public void setTo(LocalTime to) { this.to = to; }
}
