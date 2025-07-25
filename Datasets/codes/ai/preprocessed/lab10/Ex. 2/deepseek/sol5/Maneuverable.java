import evangelion.obstacles.Obstacle;

public interface Maneuverable {
    boolean maneuver(Obstacle obstacle);
    boolean isOperational();
}