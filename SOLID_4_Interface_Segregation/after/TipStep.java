package after;

public class TipStep {
    private final TipScreen screen;

    public TipStep(TipScreen screen) {
        this.screen = screen;
    }

    public void run() {
        System.out.println("Tip for the driver: " + screen.askTip() + " EUR");
    }
}
