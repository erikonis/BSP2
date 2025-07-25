public class RobotActions {

    public static class GoForwardAction extends Action {
        public GoForwardAction() {
            super("Go Forward", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes forward 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class GoBackAction extends Action {
        public GoBackAction() {
            super("Go Back", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes back 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class GoLeftAction extends Action {
        public GoLeftAction() {
            super("Go Left", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes left 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class GoRightAction extends Action {
        public GoRightAction() {
            super("Go Right", 10);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot goes right 20 cm.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class TakePhotoAction extends Action {
        private boolean highResolution;

        public TakePhotoAction(boolean highResolution) {
            super(highResolution ? "Take High-Resolution Photo" : "Take Low-Resolution Photo", highResolution ? 60 : 40);
            this.highResolution = highResolution;
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot takes a " + (highResolution ? "high" : "low") + "-resolution photo.");
            robot.decreaseBattery(getCost());
        }
    }

    public static class PickRockAction extends Action {
        public PickRockAction() {
            super("Pick Up Rock", 150);
        }

        @Override
        public void execute(Robot robot) {
            System.out.println("Robot picks up a rock.");
            robot.decreaseBattery(getCost());
        }
    }
}