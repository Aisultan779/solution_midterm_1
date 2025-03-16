package payment;

public class LegacyPayPalAPI {
    public boolean sendPayment(String email, double amount) {
        System.out.println("LegacyPayPalAPI: Sending payment of $" + amount + " to " + email);
        if (amount > 5000) {
            System.out.println("LegacyPayPalAPI: Payment failed due to amount limit.");
            return false;
        }
        System.out.println("LegacyPayPalAPI: Payment successful.");
        return true;
    }
}
