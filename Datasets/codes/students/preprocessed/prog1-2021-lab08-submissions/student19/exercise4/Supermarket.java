import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Supermarket {
    Map<LocalDate, UUID> map = new HashMap<LocalDate, UUID>();

    public Map<LocalDate, UUID> getMap() {
        return map;
    }

    public void setMap(Map<LocalDate, UUID> map) {
        this.map = map;
    }

}
