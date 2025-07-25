public class Main {
    public static void main(String[] args) {
        LoyaltyProgram program = new LoyaltyProgram();
        LoyaltyCard card1 = new LoyaltyCard("1234");
        LoyaltyCard card2 = new LoyaltyCard("5678");

        program.registerPurchase(card1, 50);
        program.registerPurchase(card2, 100);

        program.redeem(card1, 5); // Successful redemption
        program.redeem(card1, 5); // Should be blocked (already redeemed today)
        program.redeem(card2, 15); // Successful redemption
    }
}
