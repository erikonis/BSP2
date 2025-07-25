import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> data;

    public Supermarket(Map<LocalDate, List<LoyaltyCard>> data) {
        this.data = data;
    }

    public Map<LocalDate, List<LoyaltyCard>> getData() {
        return data;
    }

    public void setData(Map<LocalDate, List<LoyaltyCard>> data) {
        this.data = data;
    }

    
}
