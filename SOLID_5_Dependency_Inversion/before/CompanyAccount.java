package before;

public class CompanyAccount {
    private final String company;

    public CompanyAccount(String company) {
        this.company = company;
    }

    public void bill(double amount) {
        System.out.println("Billed to " + company + ": " + amount + " EUR");
    }
}
