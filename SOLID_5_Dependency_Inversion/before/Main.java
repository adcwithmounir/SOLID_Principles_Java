package before;

public class Main {
    public static void main(String[] args) {
        new TripCheckout(false).finish(18.5);
        new TripCheckout(true).finish(42.0);
    }
}
