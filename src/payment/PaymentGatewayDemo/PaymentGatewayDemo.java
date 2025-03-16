package payment;

import java.util.Scanner;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Payment Gateway Demo ===");
        System.out.println("Select payment method: (1) Credit Card, (2) PayPal, (3) Cryptocurrency");
        String choice = scanner.nextLine();
        PaymentMethod paymentMethod = null;
        switch (choice) {
            case "1":
                paymentMethod = PaymentFactory.getPaymentMethod("creditcard");
                break;
            case "2":
                paymentMethod = PaymentFactory.getPaymentMethod("paypal");
                break;
            case "3":
                paymentMethod = PaymentFactory.getPaymentMethod("crypto");
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("Enter amount to pay:");
        double amount = scanner.nextDouble();
        System.out.println("Processing payment...");
        Transaction transaction = paymentMethod.processPayment(amount);
        System.out.println("Transaction result: " + transaction);
    }
}
