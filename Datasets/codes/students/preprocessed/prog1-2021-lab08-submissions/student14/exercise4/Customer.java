import java.util.ArrayList;

public class Customer {
    
    private String name;

    ArrayList<LoyaltyCard> cardList;;

    public Customer(String name){
        this.setName(name);
        cardList = new ArrayList<LoyaltyCard>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
