package Exercises.Exercise4;

public class Item extends Supermarket
{
    private double price;

    public Item(double pPrice)
    {
        price = pPrice;
    }

    public int calcPoints()
    {
        return (int)(price*0.1);
    }

    public int buy(LoyaltyCard p1)
    {
        p1.addPoints(calcPoints());
        return p1.getPoints();
    }

    public int buyWithPoints(LoyaltyCard p1)
    {
        int roundPrice = (int)(Math.ceil(price));
        if(!super.checkIfRedeemedAllready(p1) && p1.getPoints() >= roundPrice)
        {
            p1.subPoints(roundPrice);
            super.add(p1);
            return p1.getPoints();
        }
        return p1.getPoints();
    }
}
