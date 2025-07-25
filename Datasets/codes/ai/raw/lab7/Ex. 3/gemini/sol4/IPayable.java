public interface IPayable {
    double getAmount();
    boolean canPay();
    double executePayment();
}