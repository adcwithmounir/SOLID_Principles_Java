package after;

public class Main {
    public static void main(String[] args) {
        PhoneScreen phone = new PhoneScreen();
        new BookingStep(phone).run(18.5);
        new RatingStep(phone).run();
        new TipStep(phone).run();

        KioskScreen kiosk = new KioskScreen();
        new BookingStep(kiosk).run(42.0);
    }
}
