public interface Payment {
    boolean canMakePayment(double amount);
    double executePayment(double amount) throws PaymentException;
    String getPaymentMethod();
}