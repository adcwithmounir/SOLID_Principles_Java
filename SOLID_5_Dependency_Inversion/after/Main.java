package after;

public class Main {
    public static void main(String[] args) {
        PaymentMethod card = new CardTerminal();
        ReceiptSender sms = new SmsSender();
        new TripCheckout(card, sms).finish(18.5);

        PaymentMethod company = new CompanyAccount("Acme");
        ReceiptSender email = new EmailSender();
        new TripCheckout(company, email).finish(42.0);

        PaymentMethod wallet = new WalletPayment(50.0);
        new TripCheckout(wallet, sms).finish(12.0);
    }
}
