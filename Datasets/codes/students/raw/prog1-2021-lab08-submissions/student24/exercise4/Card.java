package exercise4;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Card {
    private double points = 0;
    private UUID ID;
    private Supermarket supermarket;

    public Card(UUID iD, Supermarket supermarket) {
        this.ID = iD;
        this.supermarket = supermarket;
    }

    public UUID getID() {
        return ID;
    }

    public void buy(double amount) {
        points += amount * 0.1;
        System.out.printf("You paid: %.2f EURO\n", amount);
        System.out.printf("You got: %.2f points\n", (amount*0.1));
        System.out.printf("Total points: %.2f\n", points);
        System.out.println();
    }

    public void redeem(double amount) {
        if (points >= amount && !supermarket.getMap().containsKey(LocalDate.now()) && !supermarket.getMap().containsValue(ID)) {
            points -= amount;
            supermarket.getMap().put(LocalDate.now(), ID);
            System.out.printf("You used %.2f points\n", amount);
            System.out.printf("Points left: %.2f\n", points);
        } else if (supermarket.getMap().containsKey(LocalDate.now()) && supermarket.getMap().containsValue(ID)) {
            System.out.println("You cannot redeem yet. You need to wait until tomorrow.");
        } else {
            System.out.println("You don't have enough points to buy the product with points.");
        }
        System.out.println();
    }

    @Override
    public int hashCode() {
        return 7 * Double.hashCode(points)
        + 13 * Objects.hashCode(ID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if (this.getID() == ((Card) obj).getID()) {
            return true;
        } else {
            return false;
        }
        
    }

}
