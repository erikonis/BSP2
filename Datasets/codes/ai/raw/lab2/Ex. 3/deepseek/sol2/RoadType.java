public class RoadType {
    private int id;
    private String name;
    private int speedLimit;

    public RoadType(int id, String name, int speedLimit) {
        this.id = id;
        this.name = name;
        this.speedLimit = speedLimit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }
}