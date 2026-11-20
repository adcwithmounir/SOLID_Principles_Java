package after;

public class Comfort implements RideOption {
    @Override public String label() { return "Comfort"; }
    @Override public int seats() { return 4; }

    @Override
    public double fare(double km, int minutes) {
        return 4.00 + km * 1.60 + minutes * 0.40;
    }
}
