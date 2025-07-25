public class DebitCardPayment extends CardPayment {
    public DebitCardPayment(BankAccount account, String cardNumber) {
        super(account, cardNumber);
    }

    @Override
    public String getPaymentMethod() {
        return "Debit Card";
    }
}