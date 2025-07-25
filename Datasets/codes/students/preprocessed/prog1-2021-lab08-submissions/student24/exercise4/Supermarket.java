import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class Supermarket {
    private Map<LocalDate,UUID> map;

    public Supermarket(Map<LocalDate,UUID> map) {
        this.map = map;
    }

    public Map<LocalDate, UUID> getMap() {
        return map;
    }

    public void setMap(Map<LocalDate, UUID> map) {
        this.map = map;
    }

}
