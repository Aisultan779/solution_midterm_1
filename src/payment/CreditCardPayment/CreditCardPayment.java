package payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public Transaction processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        if (amount > 10000) {
            System.out.println("Credit card payment failed: amount too high.");
            return new Transaction(amount, PaymentStatus.FAILED, "Credit Card");
        }
        System.out.println("Credit card payment completed.");
        return new Transaction(amount, PaymentStatus.COMPLETED, "Credit Card");
    }
}
