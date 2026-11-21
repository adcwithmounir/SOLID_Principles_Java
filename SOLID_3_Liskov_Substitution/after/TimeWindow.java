package after;

import java.time.Duration;
import java.time.LocalTime;

public interface TimeWindow {
    LocalTime from();
    LocalTime to();

    default long minutes() {
        return Duration.between(from(), to()).toMinutes();
    }
}
