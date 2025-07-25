import java.time.LocalDate;
import java.util.*;

public class Supermarket {

    private Map<LocalDate,List<LoyaltyCard>> redeemed = new HashMap<>();
    private Map<String,List<LoyaltyCard>> allCards = new HashMap<>();

    public void addCard(String name, int n) {
        // If amount of cards n is 0 no cards can be added
        if(n == 0) {
            System.out.println("ERROR: 0 cards cannot be added to " + name);
        }
        else {
            // Creates new list, cards are stored in it and then added to a map with all the cards assigned to different customers
            List<LoyaltyCard> cards = new ArrayList<>();
            UUID newID = UUID.randomUUID();
            for(int i=0; i<=n; i++){
                cards.add(new LoyaltyCard(newID));
            }
            allCards.put(name, cards);
            System.out.println("Successfully added" + n + "cards to " + name);
        }
    }

    public int redeem(LoyaltyCard card, int amount) {
        // First prints amount of points
        System.out.println("Points: " + card.getPoints());
        int redeem=0;
        
        // If amount of points are not enough no points are redeemed
        if(card.getPoints() < amount) {
            System.out.println("Not enough points in the card!");
        }
        else {
            card.setPoints(card.getPoints() - amount);
            redeem = amount;
            System.out.println("Points were redeemed successfully!");

            // Checks if value is in Map, if not creates new ArrayList with the card in it, if yes just adds card to the existing list.
            List<LoyaltyCard> cards = redeemed.get(LocalDate.now());
            if(cards == null){
                cards = new ArrayList<>();
            }
            cards.add(card);
            redeemed.put(LocalDate.now(), cards);
        }
        return redeem;
    }

    public void buy(List<Item> items, LoyaltyCard card, boolean redeem, int amount) {
        double total = 0;
        int points = 0;
        // If customer wishes to redeem points, stores the points in variable
        if(redeem) {
            points = redeem(card,amount);
        }
        // Calculates total price and adds points to card if customer has one
        for(Item i : items) {
            if(i == null) {
                break;
            }
            else {
                total += i.getPrice() - points;
                if(card != null) {
                    card.setPoints(card.getPoints() + (int) (total*0.1));
                }
            
            }
        }
        System.out.println("Total: " + total + "€" + "\nPoints to be added: " + (int) (total*0.1) + "\nNew points: " + card.getPoints());
    } 

    public void getHistory(){
        // For every date in Map, prints the ID of the card that redeemed that day
        for(LocalDate key: redeemed.keySet()){
            System.out.println(key + ":");
            for(int i=0; i<redeemed.get(key).size(); i++){
                System.out.println("ID: " + redeemed.get(key).get(i).getID());
            }
            System.out.println("\n");
        }
    }
}
