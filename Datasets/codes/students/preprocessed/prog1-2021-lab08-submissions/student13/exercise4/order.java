public class order {

    private loyaltyCardUser card;
    private double payment;

    public order(loyaltyCardUser card, double payment) {
        this.card = card;
        this.payment = payment;
    }

    public void pay()
    {
        card.setPoints(card.getPoints() + (payment/10));
        System.out.println("You paid " + payment + " € and received " + (payment/10) + " points.");
    }

    public void payWithPoints()
    {
        if (payment <= card.getPoints())
        {
            card.setPoints(card.getPoints()-payment);
            System.out.println("You redeemed " + payment + " points and now have " + card.getPoints() + " points left");
        }
        else {System.out.println("You don't have enough points on your card.");}
    }



}
