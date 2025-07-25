import java.util.*;

public class Main {
    public static void main(String[] args) {
        Robot rover = new Robot();
        List<Action> mission = Arrays.asList(
            new MovementActions.Forward(),
            new MovementActions.Left(),
            new MovementActions.Left(),
            new MovementActions.Left(),
            new MovementActions.Forward(),
            new MissionActions.PickRock(),
            new MovementActions.Forward(),
            new MovementActions.Forward(),
            new MissionActions.TakePhoto(true),
            new MovementActions.Right(),
            new MovementActions.Right(),
            new MovementActions.Forward()
        );

        System.out.println("Starting Mars Mission");
        for (Action action : mission) {
            if (rover.getBattery() <= 0) {
                System.out.println("Battery depleted!");
                break;
            }

            action.execute(rover);
            System.out.printf("%s | Pos: (%d,%d) | Battery: %d%n",
                action.getDescription(), rover.getX(), rover.getY(), rover.getBattery());

            if (rover.missionComplete()) {
                System.out.println("MISSION SUCCESS!");
                break;
            }
        }
    }
}