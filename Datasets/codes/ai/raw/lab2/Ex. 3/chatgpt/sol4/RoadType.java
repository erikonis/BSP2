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

    public static RoadType getById(int id) {
        switch (id) {
            case 1: return new RoadType(1, "motorway", 130);
            case 2: return new RoadType(2, "ordinary", 90);
            case 3: return new RoadType(3, "town", 50);
            case 4: return new RoadType(4, "calmed", 30);
            default: return null;
        }
    }
}