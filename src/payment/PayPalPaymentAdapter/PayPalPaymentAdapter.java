package payment;

public class PayPalPaymentAdapter implements PaymentMethod {
    private LegacyPayPalAPI legacyPayPalAPI;
    private String email;

    public PayPalPaymentAdapter() {
        this.legacyPayPalAPI = new LegacyPayPalAPI();
        this.email = "ais@aid.com";
    }

    @Override
    public Transaction processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
        boolean result = legacyPayPalAPI.sendPayment(email, amount);
        if (result) {
            return new Transaction(amount, PaymentStatus.COMPLETED, "PayPal");
        } else {
            return new Transaction(amount, PaymentStatus.FAILED, "PayPal");
        }
    }
}
