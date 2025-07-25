package lu.uni.programming1.lab8.exercise4;

public class LoyaltyCard {

        private String client;
        private String cardID;
        private int points;
    
        public LoyaltyCard(String client, String cardID, int points) {
            this.cardID = cardID;
            this.points = points;
            this.client = client;
        }

        public String getClient() {
            return client;
        }
    
        public String getCardID() {
            return cardID;
        }
    
        public int getPoints() {
            return points;
        }
    
        public void buy(double amount) {
            this.points = (int) (points + Math.floor(amount / 10));
            System.out.format(String.format("%s bought for %.2f euro, current %d points.", this, amount, this.points));
        }
    
        public boolean doRedeem(double amount) {
            return this.points >= Math.ceil(amount);
        }
    
        public void redeem(double amount) {
            if (this.doRedeem(amount)) {
                this.points -= (int) Math.ceil(amount);
                System.err.println(
                        String.format("%s %2f euro has been redeemed, current %d points.", this, amount, this.points));
            }
    
        }
        
        @Override
        public int hashCode() {
            return this.cardID.hashCode();
        }
    
        @Override
        public boolean equals(Object myObj) {
    
            if (myObj == this) {
                return true;
            }
    
            if (!(myObj instanceof LoyaltyCard)) {
                return false;
            }
    
            LoyaltyCard card = (LoyaltyCard) myObj;
    
            return this.cardID.equals(card.getCardID());
        }
    
        @Override
        public String toString() {
            return "\nLoyalty Card of "+client+" nº " + cardID;
        }
    
    
    
}
