public class PayPalPayment implements PaymentMethod {
    private final String email;

    public PayPalPayment(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid PayPal email");
        }
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    @Override
    public boolean authorize(double amount, double moneyGiven) {
        return amount > 0; // Simplified authorization
    }

    @Override
    public PaymentResult process(double amount, double moneyGiven) {
        if (authorize(amount, moneyGiven)) {
            return new PaymentResult(true,
                "PayPal payment from " + email + " processed",
                0);
        }
        return new PaymentResult(false, "PayPal authorization failed", 0);
    }

    @Override
    public String getDescription() {
        return "PayPal (" + email + ")";
    }
}