package before;

public class RatingStep {
    private final RiderScreen screen;

    public RatingStep(RiderScreen screen) {
        this.screen = screen;
    }

    public void run() {
        System.out.println("Driver rated " + screen.askRating() + " stars");
    }
}
