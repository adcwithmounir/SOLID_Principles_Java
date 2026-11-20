package after;

public class Economy implements RideOption {
    @Override public String label() { return "Economy"; }
    @Override public int seats() { return 4; }

    @Override
    public double fare(double km, int minutes) {
        return 2.50 + km * 1.20 + minutes * 0.30;
    }
}
