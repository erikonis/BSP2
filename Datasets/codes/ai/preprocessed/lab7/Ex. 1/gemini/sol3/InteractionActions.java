public class InteractionActions {

    public static class TakePhotoAction extends InteractionAction {
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

    public static class PickRockAction extends InteractionAction {
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