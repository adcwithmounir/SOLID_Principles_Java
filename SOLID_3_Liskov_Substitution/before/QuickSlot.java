package before;

import java.time.LocalTime;

public class QuickSlot extends PickupWindow {
    private static final int LENGTH = 10;

    public QuickSlot(LocalTime from) {
        super(from, from.plusMinutes(LENGTH));
    }

    @Override
    public void setFrom(LocalTime from) {
        super.setFrom(from);
        super.setTo(from.plusMinutes(LENGTH));
    }

    @Override
    public void setTo(LocalTime to) {
        super.setTo(to);
        super.setFrom(to.minusMinutes(LENGTH));
    }
}
