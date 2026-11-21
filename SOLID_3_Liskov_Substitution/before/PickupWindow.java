package before;

import java.time.Duration;
import java.time.LocalTime;

public class PickupWindow {
    private LocalTime from;
    private LocalTime to;

    public PickupWindow(LocalTime from, LocalTime to) {
        this.from = from;
        this.to = to;
    }

    public LocalTime from() { return from; }
    public LocalTime to() { return to; }

    public void setFrom(LocalTime from) { this.from = from; }
    public void setTo(LocalTime to) { this.to = to; }

    public long minutes() {
        return Duration.between(from, to).toMinutes();
    }
}
