import model.*;
import service.LoyaltyService;

public class Main {
    public static void main(String[] args) {
        LoyaltyService service = new LoyaltyService();
        
        // Create family account
        service.createCustomerAccount("SMITH_FAMILY");
        
        // Issue cards for family members
        service.issueNewCard("SMITH_FAMILY", "CARD_001");
        service.issueNewCard("SMITH_FAMILY", "CARD_002");
        service.issueNewCard("SMITH_FAMILY", "CARD_003");
        
        // Record purchases
        service.recordPurchase("CARD_001", 100.0); // +10 points
        service.recordPurchase("CARD_002", 50.0);  // +5 points
        service.recordPurchase("CARD_003", 200.0); // +20 points
        
        // Attempt redemptions
        System.out.println("Redemption 1 (CARD_001, 5 points): " + 
            (service.redeemPoints("CARD_001", 5) ? "Success" : "Failed"));
        
        System.out.println("Redemption 2 (CARD_001, 5 points): " + 
            (service.redeemPoints("CARD_001", 5) ? "Success" : "Failed")); // Should fail (same day)
            
        System.out.println("Redemption 3 (CARD_002, 10 points): " + 
            (service.redeemPoints("CARD_002", 10) ? "Success" : "Failed")); // Should fail (not enough points)
            
        System.out.println("Redemption 4 (CARD_003, 10 points): " + 
            (service.redeemPoints("CARD_003", 10) ? "Success" : "Failed"));
        
        // Print current status
        System.out.println("\nCurrent account status:");
        service.getCustomerAccount("SMITH_FAMILY").getCards().forEach(card -> 
            System.out.printf("Card %s: %d points%n", card.getCardNumber(), card.getPoints()));
    }
}