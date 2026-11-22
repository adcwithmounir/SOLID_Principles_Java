package after;

public class EmailSender implements ReceiptSender {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
