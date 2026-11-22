package after;

public class CompanyAccount implements PaymentMethod {
    private final String company;

    public CompanyAccount(String company) {
        this.company = company;
    }

    public void pay(double amount) {
        System.out.println("Billed to " + company + ": " + amount + " EUR");
    }
}
