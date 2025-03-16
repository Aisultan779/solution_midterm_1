package payment;

public class Transaction {
    private static int counter = 1;
    private int id;
    private double amount;
    private PaymentStatus status;
    private String paymentMethod;

    public Transaction(double amount, PaymentStatus status, String paymentMethod) {
        this.id = counter++;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Transaction #" + id + ": " + paymentMethod + " payment of $" + amount + " - " + status;
    }
}
