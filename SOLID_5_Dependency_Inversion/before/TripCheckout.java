package before;

public class TripCheckout {
    private final CardTerminal card = new CardTerminal();
    private final SmsSender sms = new SmsSender();
    private final CompanyAccount company = new CompanyAccount("Acme");
    private final EmailSender email = new EmailSender();
    private final boolean business;

    public TripCheckout(boolean business) {
        this.business = business;
    }

    public void finish(double fare) {
        if (business) {
            company.bill(fare);
            email.mail("Thanks for riding, you paid " + fare + " EUR");
            return;
        }
        card.debit(fare);
        sms.text("Thanks for riding, you paid " + fare + " EUR");
    }
}
