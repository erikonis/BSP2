package exercise4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> map;

    public Supermarket() {
        map = new HashMap<>();
    }

    public void add(Customer customer){
        map.put(LocalDate.now(), customer.getList());
    }
}
