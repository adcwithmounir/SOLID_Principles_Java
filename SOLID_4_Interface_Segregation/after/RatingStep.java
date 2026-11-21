package after;

public class RatingStep {
    private final RatingScreen screen;

    public RatingStep(RatingScreen screen) {
        this.screen = screen;
    }

    public void run() {
        System.out.println("Driver rated " + screen.askRating() + " stars");
    }
}
