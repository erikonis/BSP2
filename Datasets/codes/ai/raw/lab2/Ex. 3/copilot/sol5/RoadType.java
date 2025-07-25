public enum RoadType {
    MOTORWAY(1, "motorway", 130),
    ORDINARY(2, "ordinary", 90),
    TOWN(3, "town", 50),
    CALMED(4, "calmed", 30);

    private final int id;
    private final String name;
    private final int speedLimit;

    RoadType(int id, String name, int speedLimit) {
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
        for (RoadType type : values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }
}
