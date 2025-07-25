public class CreditCard extends AbstractCard{
    public CreditCard(String cardNumber, BankAccount bankAccount){
        super(cardNumber, bankAccount, "credit");
    }
}