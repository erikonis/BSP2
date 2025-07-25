import java.util.List;

public class Customer {
    private List<LoyaltyCard> list;
    
    public Customer(List<LoyaltyCard> list) {
        this.list = list;
    }

    public List<LoyaltyCard> getList(){
        return list;
    }

    public void addToList(LoyaltyCard card){
        if(list.isEmpty()){
            list.add(card);
        }
        else if(list.get(0).equals(card)){
            list.add(card);
        }
        else{
            System.out.println("The customer does not own this card !");
        }
    }
}
