import java.time.LocalDate;

public class Launcher {

    public static void main(String[] args) {

        LocalDate Datetest = LocalDate.of(2021,11,21);
        
        Card card0 = new Card(0);

        Card card1 = new Card(1);

        Registry Regis = new Registry();

        Regis.testAdd(card0, Datetest);

        Regis.testAdd(card1, Datetest);

        card0.pay(100);

        card1.pay(1000);

        // Card0 has 10 points / Card1 has 100 points

        card0.redeem(10000, Regis);

        card1.redeem(1, Regis);

        // Card0 cannot redeem because it doesn't have enough points, so it's not added to the list.
        // Card1 has enough points, so it can redeem and it is added to the list.

        /*if (Regis.check(card0, Datetest)) {
            System.out.println("card0 datetest OK");
        }

        if (Regis.check(card0, LocalDate.now())) {
            System.out.println("card0 currentdate OK");
        }

        if (Regis.check(card1, Datetest)) {
            System.out.println("card1 datetest OK");
        }

        if (Regis.check(card1, LocalDate.now())) {
            System.out.println("card1 currentdate OK");
        }*/

        Regis.Print(Datetest);
        Regis.Print(LocalDate.now());


    }
    
}
