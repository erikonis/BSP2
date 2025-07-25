package exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SupermarketCardInfo {

    private ArrayList<LoyaltyCard> alCards = new ArrayList<>();
    private LocalDate date;

    private int listPosition;

    private Map<LocalDate, ArrayList<LoyaltyCard>> redeemOfTheDate = new HashMap<>();

    public int size() {
        return alCards.size();
    }

    public LoyaltyCard get(int index) {
        return alCards.get(index);
    }

    public void put(){
        date = getDate();
        redeemOfTheDate.put(date, alCards);
    }

    public boolean add(LoyaltyCard e) {
        return alCards.add(e);
    }

    public LocalDate getDate() {
        return date = LocalDate.now();
    }

    public int search(UUID id) {
        for (int i = 0; i < alCards.size(); i++) {
            if (alCards.get(i).getId().equals(id)) {
                listPosition = i;
            }
        }

        return listPosition;
    }

    public void addRedeemOfTheDate() {
        redeemOfTheDate.put(getDate(), alCards);
    }

}
