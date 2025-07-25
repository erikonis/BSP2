public class CreditCardPayment extends CardPayment {
    public CreditCardPayment(OverdraftAccount account, String cardNumber) {
        super(account, cardNumber);
    }
    
    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}