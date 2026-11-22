package after;

public class TripCheckout {
    private final PaymentMethod payment;
    private final ReceiptSender receipts;

    public TripCheckout(PaymentMethod payment, ReceiptSender receipts) {
        this.payment = payment;
        this.receipts = receipts;
    }

    public void finish(double fare) {
        payment.pay(fare);
        receipts.send("Thanks for riding, you paid " + fare + " EUR");
    }
}
