import java.util.HashMap;
import java.util.Map;

public class RoadTypeRegistry {
    private final Map<Integer, RoadType> roadTypes;

    public RoadTypeRegistry() {
        this.roadTypes = new HashMap<>();
        initializeRoadTypes();
    }

    private void initializeRoadTypes() {
        roadTypes.put(1, new RoadType("motorway", 130));
        roadTypes.put(2, new RoadType("ordinary", 90));
        roadTypes.put(3, new RoadType("town", 50));
        roadTypes.put(4, new RoadType("calmed", 30));
    }

    public RoadType getRoadType(int typeId) {
        return roadTypes.get(typeId);
    }
}