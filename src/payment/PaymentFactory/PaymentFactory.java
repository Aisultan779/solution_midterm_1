package payment;

public class PaymentFactory {
    public static PaymentMethod getPaymentMethod(String type) {
        if (type.equalsIgnoreCase("creditcard")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPaymentAdapter();
        } else if (type.equalsIgnoreCase("crypto")) {
            return new CryptoPayment();
        } else {
            throw new IllegalArgumentException("Unknown payment method: " + type);
        }
    }
}
