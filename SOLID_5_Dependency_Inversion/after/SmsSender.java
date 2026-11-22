package after;

public class SmsSender implements ReceiptSender {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
