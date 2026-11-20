package after;

public interface RideOption {
    String label();
    int seats();
    double fare(double km, int minutes);
}
