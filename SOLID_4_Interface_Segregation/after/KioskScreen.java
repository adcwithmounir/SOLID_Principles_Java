package after;

public class KioskScreen implements BookingScreen {
    public String askPickup() {
        return "Terminal 2";
    }

    public void showFare(double fare) {
        System.out.println("Kiosk: your fare is " + fare + " EUR");
    }
}
