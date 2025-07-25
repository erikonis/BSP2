public class RoadType {
    private final String name;
    private final int speedLimit;

    public RoadType(String name, int speedLimit) {
        this.name = name;
        this.speedLimit = speedLimit;
    }

    public String getName() {
        return name;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }
}