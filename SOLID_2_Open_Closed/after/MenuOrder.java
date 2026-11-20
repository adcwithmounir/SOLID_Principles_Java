package after;

import java.util.List;

public class MenuOrder {
    private final List<Class<? extends RideOption>> table = List.of(Comfort.class, Economy.class, Xl.class);

    public int rank(RideOption option) {
        int index = table.indexOf(option.getClass());
        return index >= 0 ? index : table.size();
    }
}
