public interface PaymentMethod {
    boolean authorize(double amount, double moneyGiven);
    PaymentResult process(double amount, double moneyGiven);
    String getDescription();
}

record PaymentResult(boolean success, String message, double change) {
    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public double getChange() { return change; }
}