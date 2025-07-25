// Card.java
public class Card {
    private String cardNumber;
    private BankAccount bankAccount;

    public Card(String cardNumber, BankAccount bankAccount) {
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}