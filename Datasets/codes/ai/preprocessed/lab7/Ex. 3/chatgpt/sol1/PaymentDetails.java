public class PaymentDetails {
    private double amountPaid;
    private String method;

    public PaymentDetails(double amountPaid, String method) {
        this.amountPaid = amountPaid;
        this.method = method;
    }

    public void printDetails() {
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Payment Method: " + method);
    }
}