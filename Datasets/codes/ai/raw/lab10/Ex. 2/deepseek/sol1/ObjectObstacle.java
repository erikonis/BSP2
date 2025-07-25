public class ObjectObstacle implements Obstacle {
    @Override
    public int getMentalToll() {
        return 0;
    }
    
    @Override
    public String getDescription() {
        return "Stationary Object";
    }
}