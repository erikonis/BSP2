public record PaymentResult(
    boolean success,
    String transactionId,
    String message,
    double amount,
    double change
) {
    public static PaymentResult success(String transactionId, String message, double amount, double change) {
        return new PaymentResult(true, transactionId, message, amount, change);
    }

    public static PaymentResult failure(String message) {
        return new PaymentResult(false, null, message, 0, 0);
    }
}