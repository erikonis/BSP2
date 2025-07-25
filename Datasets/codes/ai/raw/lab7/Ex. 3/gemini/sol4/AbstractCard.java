public abstract class AbstractCard implements CardInterface {
    private String cardNumber;
    private BankAccount bankAccount;
    private String cardType;

    public AbstractCard(String cardNumber, BankAccount bankAccount, String cardType) {
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
        this.cardType = cardType;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public BankAccount getBankAccount() {
        return bankAccount;
    }

     @Override
    public String getCardType() {
        return cardType;
    }
}