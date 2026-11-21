package before;

public class PhoneScreen implements RiderScreen {
    public String askPickup() {
        return "Central Station";
    }

    public void showFare(double fare) {
        System.out.println("Phone: your fare is " + fare + " EUR");
    }

    public int askRating() {
        return 5;
    }
}
