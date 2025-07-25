package evangelion.obstacles;

public class ObjectObstacle extends Obstacle {
    @Override
    public int getMentalToll() { return 0; }
    
    @Override
    public String toString() { 
        return "Object Obstacle (0)"; 
    }
}