package exercise4;

public class Main {
    public static void main(String[] args) {
        //Different customers card
        Card c1 = new Card(1,1);
        Card c2 = new Card(2,1);
        Card c3 = new Card(3,1);
        //New card of customer c1
        Card c4 = new Card(1,2);

        Supermarket supermarket = new Supermarket();

        //All Customers c1,c2 and c3 bought some

        supermarket.buy(12000,c1);
        supermarket.buy(19000,c2);
        supermarket.buy(18000,c3);

        supermarket.buyWithRedeem(1200,c2);
        supermarket.buyWithRedeem(4000,c3);
        supermarket.buyWithRedeem(1200,c1);

    }
}

