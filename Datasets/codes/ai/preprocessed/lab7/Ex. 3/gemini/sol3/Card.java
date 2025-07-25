public class Card {
    private String cardNumber;
    private BankAccount bankAccount;
    private String cardType; // "debit" or "credit"

    public Card(String cardNumber, BankAccount bankAccount, String cardType) {
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
        this.cardType = cardType;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getCardType() {
        return cardType;
    }
}