import java.util.HashMap;
import java.util.Map;

public class SpeedLimitChecker {
    private Map<Integer, RoadType> roadTypes;

    public SpeedLimitChecker() {
        roadTypes = new HashMap<>();
        roadTypes.put(1, new RoadType(1, "motorway", 130));
        roadTypes.put(2, new RoadType(2, "ordinary", 90));
        roadTypes.put(3, new RoadType(3, "town", 50));
        roadTypes.put(4, new RoadType(4, "calmed", 30));
    }

    public void checkSpeedLimit(int roadTypeId, int speed) {
        RoadType roadType = roadTypes.get(roadTypeId);
        if (roadType == null) {
            System.out.println("Unknown road type: " + roadTypeId);
            return;
        }

        if (speed <= roadType.getSpeedLimit()) {
            System.out.println("Speed OK for " + roadType.getName() + " road.");
        } else {
            int excess = speed - roadType.getSpeedLimit();
            System.out.println("Too fast for " + roadType.getName() + " road. " + excess + " over the limit!");
        }
    }
}