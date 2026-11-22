package after;

public class CardTerminal implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Card: " + amount + " EUR debited");
    }
}
