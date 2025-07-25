import java.time.LocalDate;
import java.util.*;

class LoyaltyCard {
    private String id;
    private double points;

    public LoyaltyCard(String id, double points) {
        this.id = id;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public double getPoints() {
        return points;
    }

    public void addPoints(double amount) {
        this.points += amount * 0.10;
    }

    public boolean redeem(double amount) {
        if (points >= amount) {
            points -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LoyaltyCard that = (LoyaltyCard) obj;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> redeemedCards = new HashMap<>();

    public void addPurchase(LoyaltyCard card, double amount) {
        card.addPoints(amount);
    }

    public boolean redeem(LoyaltyCard card, double amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> redeemedToday = redeemedCards.getOrDefault(today, new ArrayList<>());

        if (redeemedToday.contains(card)) {
            System.out.println("Card has already been used to redeem today.");
            return false;
        }

        if (card.redeem(amount)) {
            redeemedToday.add(card);
            redeemedCards.put(today, redeemedToday);
            System.out.println("Redeem successful.");
            return true;
        } else {
            System.out.println("Insufficient points.");
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        LoyaltyCard card1 = new LoyaltyCard("123", 100);
        LoyaltyCard card2 = new LoyaltyCard("123", 50);

        supermarket.addPurchase(card1, 200);
        System.out.println("Card1 points: " + card1.getPoints());

        supermarket.redeem(card1, 20);
        System.out.println("Card1 points after redeem: " + card1.getPoints());

        supermarket.redeem(card1, 20); // Should fail as card1 has already redeemed today
        supermarket.redeem(card2, 20); // Should succeed as card2 has not redeemed today
    }
}