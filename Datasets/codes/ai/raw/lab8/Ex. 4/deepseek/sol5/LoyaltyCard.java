package model;

import java.util.Objects;

public final class LoyaltyCard {
    private final String cardId;
    private final String cardNumber; // Unique per physical card
    private final int points;

    public LoyaltyCard(String cardId, String cardNumber, int initialPoints) {
        if (cardId == null || cardId.isBlank()) {
            throw new IllegalArgumentException("Card ID cannot be null or blank");
        }
        if (cardNumber == null || cardNumber.isBlank()) {
            throw new IllegalArgumentException("Card number cannot be null or blank");
        }
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.points = initialPoints;
    }

    public LoyaltyCard addPoints(int pointsToAdd) {
        return new LoyaltyCard(cardId, cardNumber, points + pointsToAdd);
    }

    public LoyaltyCard redeemPoints(int pointsToRedeem) {
        if (pointsToRedeem > points) {
            throw new IllegalArgumentException("Not enough points available");
        }
        return new LoyaltyCard(cardId, cardNumber, points - pointsToRedeem);
    }

    // Getters
    public String getCardId() { return cardId; }
    public String getCardNumber() { return cardNumber; }
    public int getPoints() { return points; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoyaltyCard that = (LoyaltyCard) o;
        return cardNumber.equals(that.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber);
    }
}