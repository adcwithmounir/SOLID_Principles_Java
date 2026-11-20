package after;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RideMenu {
    private final MenuOrder order;

    public RideMenu(MenuOrder order) {
        this.order = order;
    }

    public void print(List<RideOption> options, double km, int minutes) {
        List<RideOption> sorted = new ArrayList<>(options);
        sorted.sort(Comparator.comparingInt(order::rank));
        for (RideOption option : sorted) {
            System.out.println(option.label() + " - " + option.seats() + " seats - "
                    + String.format("%.2f", option.fare(km, minutes)) + " EUR");
        }
    }
}
