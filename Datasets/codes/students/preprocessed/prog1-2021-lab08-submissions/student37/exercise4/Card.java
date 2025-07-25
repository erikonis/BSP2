import java.time.LocalDate;

public class Card {

    private int ID;
    private float points;

    public Card(int ID) {
        this.ID=ID;
        points=0;
    }

    public void pay(float price) {
        points+=(price/10);
    }

    public void redeem(float price, Registry test) {
        if (!test.checkExist(LocalDate.now()) && points>=price) {
            test.AddCard(this);
            points-=price;
        }

        else if (!test.check(this, LocalDate.now()) && points>=price) {
            test.AddCard(this);
            points-=price;
        }
    }

    public int GetID() {
        return ID;
    }

    public float GetPoints() {
        return points;
    }

    @Override
    public boolean equals(Object a) {
        
        if (a==this) {
            return true;
        }
        
        if (!(a instanceof Card)) {
            return false;
        }
        
        Card k = (Card)a;
        return (ID == k.GetID());
    
    }
    
    @Override
    public int hashCode() {
        int value;
        value = GetID();
        return value;
    }

}
