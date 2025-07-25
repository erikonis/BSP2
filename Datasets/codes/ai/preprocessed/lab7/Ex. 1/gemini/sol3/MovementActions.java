public class MovementActions {

    public static class GoForwardAction extends MovementAction {
        public GoForwardAction() {
            super("Go Forward", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes forward 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class GoBackAction extends MovementAction {
        public GoBackAction() {
            super("Go Back", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes back 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class GoLeftAction extends MovementAction {
        public GoLeftAction() {
            super("Go Left", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes left 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class GoRightAction extends MovementAction {
        public GoRightAction() {
            super("Go Right", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes right 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }
}