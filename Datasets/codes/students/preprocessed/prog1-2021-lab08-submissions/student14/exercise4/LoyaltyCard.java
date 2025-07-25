import java.util.UUID;

public class LoyaltyCard {
    
    private UUID cardUUID;
    private double points;
    private String name;

    public LoyaltyCard(Customer customer) {
        this.setPoints(5);
        this.setName(customer.getName());
        if(customer.cardList.size()!=0){
            this.setCardUUID(customer.cardList.get(0).getCardUUID());
        }else{
            this.setCardUUID(UUID.randomUUID());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(LoyaltyCard loyaltyCard) {

        return this.getCardUUID().equals(loyaltyCard.getCardUUID());
    }

    public UUID getCardUUID() {
        return cardUUID;
    }

    public void setCardUUID(UUID cardUUID) {
        this.cardUUID = cardUUID;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public void removePoints(double points) {
        setPoints(getPoints()-points);
    }
}
