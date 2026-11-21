package before;

public class BookingStep {
    private final RiderScreen screen;

    public BookingStep(RiderScreen screen) {
        this.screen = screen;
    }

    public void run(double fare) {
        System.out.println("Booked: pickup at " + screen.askPickup());
        screen.showFare(fare);
    }
}
