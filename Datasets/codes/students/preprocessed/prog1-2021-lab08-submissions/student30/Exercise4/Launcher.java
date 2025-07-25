public class Launcher {
    public static void main(String[] args) {
        Launcher l = new Launcher();
        Supermarket s = new Supermarket();

        Customer c1 = new Customer("Molly", "Weasley");
        Customer c2 = new Customer("Athur", "Weasley");
        Customer c3 = new Customer("Fleur", "Delacour");
        Customer c4 = new Customer("Harry", "Potter");
        Customer c5 = new Customer("Lilly", "Potter");
        Customer c6 = new Customer("James", "Potter");
        Customer c7 = new Customer("Albus Percival Wulfric Brian", "Dumbledore");
        Customer c8 = new Customer("Minerva", "McGonagall");
        Customer c9 = new Customer("Sirius", "Black");
        Customer c10 = new Customer("Regulus Arcturus", "Black");
        
        loyaltyCards w1 = new loyaltyCards(c1);
        loyaltyCards w2 = new loyaltyCards(c2, w1.getCardID());
        loyaltyCards de = new loyaltyCards(c3);
        loyaltyCards p1 = new loyaltyCards(c4);
        loyaltyCards p2 = new loyaltyCards(c5, p1.getCardID());
        loyaltyCards p3 = new loyaltyCards(c6, p1.getCardID());
        loyaltyCards du = new loyaltyCards(c7);
        loyaltyCards m = new loyaltyCards(c8);
        loyaltyCards b1 = new loyaltyCards(c9);
        loyaltyCards b2 = new loyaltyCards(c10, b1.getCardID());
        
        //some equal examples
        l.checkCardID(w1, w2);
        l.checkCardID(w1, du);
        l.checkCardID(p1, p3);
        l.checkCardID(du, de);
        l.checkCardID(b1, m);
        System.out.println("\n");

        //some getting points examples
        
        int max = 500;
        int min = 10;
        double rnd1 = Math.random()*(max-min+1)+min;
        p2.addPoints(rnd1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("\n");
        double rnd2 = Math.random()*(max-min+1)+min;
        b2.addPoints(rnd2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("\n");
        double rnd3 = Math.random()*(max-min+1)+min;
        m.addPoints(rnd3);
        System.out.println(m);
        System.out.println("\n");
        double rnd4 = Math.random()*(max-min+1)+min;
        du.addPoints(rnd4);
        System.out.println(du);
        System.out.println("\n");
        double rnd5 = Math.random()*(max-min+1)+min;
        w1.addPoints(rnd5);
        System.out.println(w1);
        System.out.println("\n");

        //some redeem examples
        //works
        l.checkRedeem(p2, p2.getLoyaltyPoints()/2, s);
        l.checkRedeem(b2, b2.getLoyaltyPoints()-1, s);
        //works not
        l.checkRedeem(m, m.getLoyaltyPoints()*2, s);
        l.checkRedeem(du, du.getLoyaltyPoints()+40, s);
        //to be sure there would be enough points on the card
        p2.addPoints(10);
        l.checkRedeem(p2, 1, s);

        System.out.println("\n");
        System.out.println(s.toString());
    }
    
    public void checkCardID(loyaltyCards c1, loyaltyCards c2){
        if(c1.equals(c2)){
            System.out.println("The loyalty cards are from the same customer \n");
        }
        else{
            System.out.println("The loyalty cards are from diffrent customers \n");
        }
    }
    public void checkRedeem(loyaltyCards c1, double price, Supermarket s){
        if(c1.getLoyaltyPoints()>= price && c1.getCount()<1){
            c1.redeem(price);
            s.addPointsToList(price);
            System.out.println("The transcation was successful for " + c1.getCustomer());
        }
        else{
            if(c1.getCount()<1){
                System.out.println(c1.getCustomer() +" does not have enough points on the card");
            }
            else{
                System.out.println("We are sorry but you" + c1.getCustomer() +" can only do 1 redeem per day");
            }

            
        }
    }
    
}
