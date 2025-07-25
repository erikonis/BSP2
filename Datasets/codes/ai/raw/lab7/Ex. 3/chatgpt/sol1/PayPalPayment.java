public class PayPalPayment extends Payment {
    private String paypalAccount;

    public PayPalPayment(String paypalAccount) {
        this.paypalAccount = paypalAccount;
    }

    @Override
    public boolean canPay(double amount) {
        // Assume always successful for this example
        return true;
    }

    @Override
    public double executePayment(double amount) {
        System.out.println("Paid " + amount + " via PayPal account " + paypalAccount);
        return 0; // No change for PayPal payment
    }
}
