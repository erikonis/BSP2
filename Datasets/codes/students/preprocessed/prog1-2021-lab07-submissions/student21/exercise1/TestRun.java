import java.util.Scanner;

public class TestRun {
    public static void main(String[] args) {

        Cell[][] currentCell = new Cell[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                currentCell[i][j] = new Cell("open", "open", "open", "open", "none");
            }
        }

        Maze maze = new Maze();
        maze.creatCells();
        maze.printMap();

        Scanner scanner = new Scanner(System.in);

        String action;

        Controller controller = new Controller();
        controller.emptyList();

        for (int i = 0; i < 10; i++) {
            System.out.println("What should the rover do?");
            action = scanner.next();

            Move move = new Move(0, "");
            Interaction interaction = new Interaction(0, "");

            controller.setInteracted(action);

            if (action.equals("move")) {
                System.out.println("Where should the rover move?");
                String direction = scanner.next();

                move = new Move(10, direction);
                move.setDirection(direction);

            } else if (action.equals("interact")) {
                System.out.println("What task should the rover do?");
                String interacted = scanner.next();

                if (interacted.equals("pick the rock")) {
                    interaction = new Interaction(150, interacted);
                    interaction.setInteraction(interacted);
                } else if (interacted.equals("take a photo")) {
                    System.out.println("In what quality schould the rover take the photo?");
                    String photoQuality = scanner.next();

                    if (photoQuality.equals("low")) {
                        interaction = new Interaction(40, interacted + ", quality " + photoQuality);
                        interaction.setInteraction(interacted + ", quality " + photoQuality);
                    } else if (photoQuality.equals("high")) {
                        interaction = new Interaction(60, interacted + ", quality " + photoQuality);
                        interaction.setInteraction(interacted);
                        interaction.setInteraction(interacted + ", quality " + photoQuality);
                    }
                }
            }

            controller.setOfActions(move, interaction);
        }

        scanner.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(controller.getSetOfActions(i));
            
        }
    }
}
