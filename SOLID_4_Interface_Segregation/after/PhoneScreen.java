package after;

public class PhoneScreen implements BookingScreen, RatingScreen, TipScreen {
    public String askPickup() {
        return "Central Station";
    }

    public void showFare(double fare) {
        System.out.println("Phone: your fare is " + fare + " EUR");
    }

    public int askRating() {
        return 5;
    }

    public int askTip() {
        return 2;
    }
}
