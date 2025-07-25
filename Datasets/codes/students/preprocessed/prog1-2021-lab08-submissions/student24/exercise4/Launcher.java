import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Launcher {
    public static void main(String[] args) {
        UUID ID = UUID.randomUUID();
        Map<LocalDate,UUID> map = new HashMap<LocalDate,UUID>();
        Supermarket supermarket = new Supermarket(map);
        Card card1 = new Card(ID,supermarket);
        Card card2 = new Card(ID,supermarket);

        ID = UUID.randomUUID();
        Card card3 = new Card(ID,supermarket);
        Card card4 = new Card(ID,supermarket);

        ID = UUID.randomUUID();
        Card card5 = new Card(ID,supermarket);
        Card card6 = new Card(ID,supermarket);

        // Family 1
        System.out.println("Family 1:");
        card1.buy(500);
        card1.redeem(5);
        card2.buy(500);
        card2.redeem(10);

        // Family 2 & 3
        System.out.println("Family 2&3:");
        card3.buy(500);
        card4.redeem(10);
        card5.redeem(10);
        card6.buy(10);
        card6.redeem(400);
    }
}
