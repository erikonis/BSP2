public class Road {
    private String type;
    private int speedLimit;

    public Road(String type, int speedLimit) {
        this.type = type;
        this.speedLimit = speedLimit;
    }

    public String getType() {
        return type;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }
}
