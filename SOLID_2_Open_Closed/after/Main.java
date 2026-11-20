package after;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RideOption> nearby = List.of(new Xl(), new Economy(), new Comfort());
        new RideMenu(new MenuOrder()).print(nearby, 8.0, 15);
    }
}
