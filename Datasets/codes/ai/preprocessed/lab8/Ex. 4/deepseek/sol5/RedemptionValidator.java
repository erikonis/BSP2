import model.LoyaltyCard;
import model.RedemptionRecord;
import java.time.LocalDate;
import java.util.List;

public class RedemptionValidator {
    public static boolean canRedeem(LoyaltyCard card, int pointsToRedeem,
                                  List<RedemptionRecord> redemptionHistory) {
        LocalDate today = LocalDate.now();

        // Check if card has enough points
        if (card.getPoints() < pointsToRedeem) {
            return false;
        }

        // Check if card was already used today
        return redemptionHistory.stream()
                .noneMatch(record -> record.getCard().equals(card) &&
                                   record.getDate().equals(today));
    }
}