import java.util.ArrayList;
import java.util.List;

public class MissionControl {
    public static void main(String[] args) {
        RobotState rover = new RobotState();
        List<Action> mission = new ArrayList<>();
        
        // Mission sequence
        mission.add(new MoveForward());
        mission.add(new MoveLeft());
        mission.add(new MoveLeft());
        mission.add(new MoveLeft());
        mission.add(new MoveForward());
        mission.add(new MissionActions.PickRock());
        mission.add(new MoveForward());
        mission.add(new MoveForward());
        mission.add(new MissionActions.TakePhoto(true));
        mission.add(new MoveRight());
        mission.add(new MoveRight());
        mission.add(new MoveForward());
        
        System.out.println("=== Mars Rover Mission ===");
        for (Action action : mission) {
            if (rover.getBattery() <= 0) {
                System.out.println("ALERT: Battery depleted!");
                break;
            }
            
            action.execute(rover);
            rover.consumeBattery(action.getBatteryCost());
            
            System.out.printf("%s | Position: (%d,%d) | Battery: %d%n",
                action.getActionName(), rover.getX(), rover.getY(), rover.getBattery());
            
            if (rover.getX() == 7 && rover.getY() == 6 && 
                rover.hasRock() && rover.hasAlienPhoto()) {
                System.out.println("MISSION ACCOMPLISHED!");
                break;
            }
        }
        
        System.out.println("\n=== Final Status ===");
        System.out.printf("Position: (%d,%d)%n", rover.getX(), rover.getY());
        System.out.println("Battery: " + rover.getBattery() + "s remaining");
        System.out.println("Rock Collected: " + rover.hasRock());
        System.out.println("Alien Photo: " + rover.hasAlienPhoto());
    }
}