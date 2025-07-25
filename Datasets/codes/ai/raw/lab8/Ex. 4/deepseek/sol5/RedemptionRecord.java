package model;

import java.time.LocalDate;
import java.util.Objects;

public class RedemptionRecord {
    private final LoyaltyCard card;
    private final LocalDate date;
    private final int pointsRedeemed;

    public RedemptionRecord(LoyaltyCard card, LocalDate date, int pointsRedeemed) {
        this.card = Objects.requireNonNull(card);
        this.date = Objects.requireNonNull(date);
        this.pointsRedeemed = pointsRedeemed;
    }

    // Getters
    public LoyaltyCard getCard() { return card; }
    public LocalDate getDate() { return date; }
    public int getPointsRedeemed() { return pointsRedeemed; }
}