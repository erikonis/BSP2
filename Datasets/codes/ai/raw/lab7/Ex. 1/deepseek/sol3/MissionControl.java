import java.util.ArrayList;
import java.util.List;

public class MissionControl {
    public static void main(String[] args) {
        Robot rover = new Robot();
        List<Action> mission = new ArrayList<>();
        
        // Build mission sequence
        mission.add(new MoveForward());
        mission.add(new MoveLeft());
        mission.add(new MoveLeft());
        mission.add(new MoveLeft());
        mission.add(new MoveForward());
        mission.add(new PickRock());
        mission.add(new MoveForward());
        mission.add(new MoveForward());
        mission.add(new TakePhoto(true));
        mission.add(new MoveRight());
        mission.add(new MoveRight());
        mission.add(new MoveForward());
        
        // Execute mission
        System.out.println("Starting Mars Mission");
        for (Action step : mission) {
            if (rover.getBattery() <= 0) {
                System.out.println("Battery depleted!");
                break;
            }
            
            step.execute(rover);
            rover.consumeBattery(step.getCost());
            
            System.out.printf("%s | Pos: (%d,%d) | Battery: %d%n",
                step.getName(), rover.getX(), rover.getY(), rover.getBattery());
            
            if (rover.getX() == 7 && rover.getY() == 6 && 
                rover.hasRock() && rover.hasAlienPhoto()) {
                System.out.println("MISSION ACCOMPLISHED!");
                break;
            }
        }
    }
}