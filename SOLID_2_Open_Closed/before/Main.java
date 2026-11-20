package before;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RideType> types = List.of(RideType.ECONOMY, RideType.COMFORT, RideType.XL);
        RideMenu.print(types, 8.0, 15);
    }
}
