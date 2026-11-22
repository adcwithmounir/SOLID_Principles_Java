package after;

public class WalletPayment implements PaymentMethod {
    private double balance;

    public WalletPayment(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        balance -= amount;
        System.out.println("Wallet: " + amount + " EUR paid, " + balance + " EUR left");
    }
}
