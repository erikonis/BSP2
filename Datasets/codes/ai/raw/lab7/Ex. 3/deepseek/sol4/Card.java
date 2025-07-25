package payment_system.model.cards;

public interface Card {
    boolean authorize(double amount);
    boolean process(double amount);
    String getCardDetails();
}