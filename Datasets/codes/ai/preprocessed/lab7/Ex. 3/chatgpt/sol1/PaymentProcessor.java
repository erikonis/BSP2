public class PaymentProcessor {
    public void processPayment(Payment payment, double amount) {
        if (payment.canPay(amount)) {
            double change = payment.executePayment(amount);
            if (change >= 0) {
                System.out.println("Payment successful, change: " + change);
            }
        } else {
            System.out.println("Payment failed.");
        }
    }
}