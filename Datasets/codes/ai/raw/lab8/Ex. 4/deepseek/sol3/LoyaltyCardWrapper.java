public class LoyaltyCardWrapper {
    private LoyaltyCard loyaltyCard;

    public LoyaltyCardWrapper(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoyaltyCardWrapper that = (LoyaltyCardWrapper) o;
        return loyaltyCard.equals(that.loyaltyCard);
    }

    @Override
    public int hashCode() {
        return loyaltyCard.hashCode();
    }

    @Override
    public String toString() {
        return loyaltyCard.toString();
    }
}