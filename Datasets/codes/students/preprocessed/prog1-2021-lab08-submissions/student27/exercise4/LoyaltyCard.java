public class LoyaltyCard {
    
    private int id;
    private int points;

    public LoyaltyCard(int id) {
        this.id = id;
        this.points = 0;
    }

    public void pay(double amount) {
        points += Math.floor(0.1 * amount);
        System.out.println("Paid: " + amount + "\nReceived: " + points + " points");
    }

    public void redeem(double amount, Supermarket supermarket) {
        if (supermarket.redeemed(this)) {
            System.err.println("You cannot redeem any points for today anymore!\nTry again tomorrow!");

        } else if (points - Math.ceil(amount) < 0) {
            System.err.println("You don't have enough points!");

        } else {
            supermarket.redeem(this);
            points -= Math.ceil(amount);
            System.out.println("Redeemed: " + Math.ceil(amount) + " points");
        }
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;    
        }

        LoyaltyCard other = (LoyaltyCard) obj;
        
        return id == other.id;
    }
}
