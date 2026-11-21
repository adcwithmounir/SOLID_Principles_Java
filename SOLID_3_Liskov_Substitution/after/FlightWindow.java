package after;

import java.time.LocalTime;

public class FlightWindow implements TimeWindow {
    private final LocalTime landing;

    public FlightWindow(LocalTime landing) {
        this.landing = landing;
    }

    public LocalTime from() { return landing.plusMinutes(20); }
    public LocalTime to() { return landing.plusMinutes(60); }
}
