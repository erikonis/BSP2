public class DebitCard extends AbstractCard {
    public DebitCard(String cardNumber, BankAccount bankAccount) {
        super(cardNumber, bankAccount, "debit");
    }
}