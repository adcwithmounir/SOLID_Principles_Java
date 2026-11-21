package after;

public class BookingStep {
    private final BookingScreen screen;

    public BookingStep(BookingScreen screen) {
        this.screen = screen;
    }

    public void run(double fare) {
        System.out.println("Booked: pickup at " + screen.askPickup());
        screen.showFare(fare);
    }
}
