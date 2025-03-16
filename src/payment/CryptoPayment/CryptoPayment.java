package payment;

public class CryptoPayment implements PaymentMethod {
    @Override
    public Transaction processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
        if (amount < 50) {
            System.out.println("Crypto payment failed: minimum amount is $50.");
            return new Transaction(amount, PaymentStatus.FAILED, "Cryptocurrency");
        }
        System.out.println("Cryptocurrency payment completed.");
        return new Transaction(amount, PaymentStatus.COMPLETED, "Cryptocurrency");
    }
}
