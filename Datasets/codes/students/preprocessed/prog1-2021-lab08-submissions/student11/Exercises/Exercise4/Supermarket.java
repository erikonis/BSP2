import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Supermarket
{
    private LocalDate date = LocalDate.now();
    private Map<LocalDate, LoyaltyCard> map;

    public Supermarket()
    {
        map = new HashMap<LocalDate, LoyaltyCard>();
    }

    public void add(LoyaltyCard l1)
    {
        map.put(date, l1);
    }

    public void clear()
    {
        map.clear();
    }

    public boolean checkIfRedeemedAllready(LoyaltyCard l1)
    {
        for (int i = 0; i < map.size(); i++)
        {
            if(l1.equals(map.get(date)))
            {
                return true;
            }
        }
        return false;
    }
}
