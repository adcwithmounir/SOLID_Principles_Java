package before;

import java.util.List;

public class RideMenu {
    public static void print(List<RideType> types, double km, int minutes) {
        for (RideType type : types) {
            String label;
            if (type == RideType.ECONOMY) {
                label = "Economy";
            } else if (type == RideType.XL) {
                label = "XL";
            } else {
                label = "Comfort";
            }
            int seats = type == RideType.XL ? 6 : 4;
            double fare = FareCalculator.fare(type, km, minutes);
            System.out.println(label + " - " + seats + " seats - " + String.format("%.2f", fare) + " EUR");
        }
    }
}
