// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Robot marsRoverPrototype = new Robot(3000);
        Controller controller = new Controller();
        List<Action> missionActions = new ArrayList<>();

        System.out.println("--- Mission Mars Prototype Test Drive ---");

        // Robot start position: can move forward
        missionActions.add(new GoForwardAction());

        // then left for 3 tiles
        missionActions.add(new GoLeftAction());
        missionActions.add(new GoLeftAction());
        missionActions.add(new GoLeftAction());

        // then forward for 1 to discover a rock
        missionActions.add(new GoForwardAction());
        missionActions.add(new PickRockAction());

        // 1 more forward for decisions: proceed forward or go right.
        missionActions.add(new GoForwardAction());

        // 1) forward: you move 1 more tile forward to discover a field of "Take a photo of alien".
        missionActions.add(new GoForwardAction());
        missionActions.add(new TakePhotoAction(true)); // High-resolution photo of alien

        // 1 tile forward is where alien exists. Going right 2 tile and forward 1 then left 1 and forward 1 reaches a finish.
        missionActions.add(new GoRightAction());
        missionActions.add(new GoRightAction());
        missionActions.add(new GoForwardAction());
        missionActions.add(new GoLeftAction());
        missionActions.add(new GoForwardAction()); // Reaches finish (according to path 1)

        // Execute the planned actions
        controller.executeActions(marsRoverPrototype, missionActions);

        System.out.println("\n--- Attempting alternative path (right decision) ---");
        Robot marsRoverPrototype2 = new Robot(3000);
        List<Action> alternativeActions = new ArrayList<>();

        // Robot start position and initial moves (same as above)
        alternativeActions.add(new GoForwardAction());
        alternativeActions.add(new GoLeftAction());
        alternativeActions.add(new GoLeftAction());
        alternativeActions.add(new GoLeftAction());
        alternativeActions.add(new GoForwardAction());
        alternativeActions.add(new PickRockAction());
        alternativeActions.add(new GoForwardAction());

        // 2) the right decision: you move 1 tile right
        alternativeActions.add(new GoRightAction());

        // encounter more decisions: proceed right or go back (up).
        // 2.1) You choose right: you can move 2 more tiles right
        alternativeActions.add(new GoRightAction());
        alternativeActions.add(new GoRightAction());

        // encounter a possibility to move 1 more tile right into a dead end or go forward 1 tile.
        alternativeActions.add(new GoRightAction()); // Leads to dead end

        controller.executeActions(marsRoverPrototype2, alternativeActions);

        System.out.println("\n--- Attempting another alternative path (right then back) ---");
        Robot marsRoverPrototype3 = new Robot(3000);
        List<Action> alternativeActions2 = new ArrayList<>();

        // Robot start position and initial moves
        alternativeActions2.add(new GoForwardAction());
        alternativeActions2.add(new GoLeftAction());
        alternativeActions2.add(new GoLeftAction());
        alternativeActions2.add(new GoLeftAction());
        alternativeActions2.add(new GoForwardAction());
        alternativeActions2.add(new PickRockAction());
        alternativeActions2.add(new GoForwardAction());
        alternativeActions2.add(new GoRightAction()); // The right decision

        // 2.2) you go 1 tile back (up)
        alternativeActions2.add(new GoBackAction());

        // then 3 Right
        alternativeActions2.add(new GoRightAction());
        alternativeActions2.add(new GoRightAction());
        alternativeActions2.add(new GoRightAction());

        // 1 back
        alternativeActions2.add(new GoBackAction()); // Ends up in a dead end

        controller.executeActions(marsRoverPrototype3, alternativeActions2);
    }
}