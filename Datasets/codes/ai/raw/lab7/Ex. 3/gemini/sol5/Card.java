public class Card {
    private String cardNumber;
    private String cardType; // "debit" or "credit"
    private double overdraftLimit;

    public Card(String cardNumber, String cardType, double overdraftLimit) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.overdraftLimit = overdraftLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
