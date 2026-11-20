package after;

public class Xl implements RideOption {
    @Override public String label() { return "XL"; }
    @Override public int seats() { return 6; }

    @Override
    public double fare(double km, int minutes) {
        return 5.00 + km * 2.00 + minutes * 0.50;
    }
}
