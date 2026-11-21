package before;

public class KioskScreen implements RiderScreen {
    public String askPickup() {
        return "Terminal 2";
    }

    public void showFare(double fare) {
        System.out.println("Kiosk: your fare is " + fare + " EUR");
    }

    public int askRating() {
        return 0; // a kiosk can't ask for a rating
    }
}
