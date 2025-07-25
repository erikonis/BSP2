package lu.uni.programming1.lab8.exercise4;


public class Launcher {
    public static void main(String[] args) {

        Supermarket cactus = new Supermarket();
        
        LoyaltyCard bobsCard = new LoyaltyCard();
        Customer bob = new Customer("Bob", bobsCard);
        Customer david = new Customer("David", bobsCard);

        LoyaltyCard bensCard = new LoyaltyCard();
        Customer ben = new Customer("Ben", bensCard);

        LoyaltyCard gregsCard = new LoyaltyCard();
        Customer greg = new Customer("Greg", gregsCard);

        Purchase p1 = new Purchase(120, bob);
        Purchase p2 = new Purchase(130, ben);
        Purchase p3 = new Purchase(150, greg);
        Purchase p4 = new Purchase(70, david);
        Purchase p5 = new Purchase(90, greg);

        Purchase p6 = new Purchase(2, bob);
        Purchase p7 = new Purchase(5, greg);
        Purchase p8 = new Purchase(90, ben);
        Purchase p9 = new Purchase(5, david);

        cactus.makePurchase(p1);
        cactus.makePurchase(p2);
        cactus.makePurchase(p3);
        cactus.makePurchase(p4);
        cactus.makePurchase(p5);

        cactus.redeemPoints(p6);
        cactus.redeemPoints(p7);
        cactus.redeemPoints(p8);
        cactus.redeemPoints(p9);
        



    }
}
