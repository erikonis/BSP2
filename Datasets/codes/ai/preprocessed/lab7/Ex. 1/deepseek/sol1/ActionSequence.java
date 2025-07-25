class MoveForward extends Action {
    public MoveForward() {
        super(10);
    }

    @Override
    public void execute(Robot robot) {
        robot.moveForward();
        robot.consumeBattery(batteryCost);
    }

    @Override
    public String getDescription() {
        return "Move Forward";
    }
}

class MoveBack extends Action {
    public MoveBack() {
        super(10);
    }

    @Override
    public void execute(Robot robot) {
        robot.moveBack();
        robot.consumeBattery(batteryCost);
    }

    @Override
    public String getDescription() {
        return "Move Back";
    }
}

class MoveLeft extends Action {
    public MoveLeft() {
        super(10);
    }

    @Override
    public void execute(Robot robot) {
        robot.moveLeft();
        robot.consumeBattery(batteryCost);
    }

    @Override
    public String getDescription() {
        return "Move Left";
    }
}

class MoveRight extends Action {
    public MoveRight() {
        super(10);
    }

    @Override
    public void execute(Robot robot) {
        robot.moveRight();
        robot.consumeBattery(batteryCost);
    }

    @Override
    public String getDescription() {
        return "Move Right";
    }
}

// Other actions
class TakePhoto extends Action {
    private final boolean highResolution;

    public TakePhoto(boolean highResolution) {
        super(highResolution ? 60 : 40);
        this.highResolution = highResolution;
    }

    @Override
    public void execute(Robot robot) {
        robot.takePhoto(highResolution);
        robot.consumeBattery(batteryCost);
    }

    @Override
    public String getDescription() {
        return "Take " + (highResolution ? "High" : "Low") + " Res Photo";
    }
}

class PickRock extends Action {
    public PickRock() {
        super(150);
    }

    @Override
    public void execute(Robot robot) {
        robot.pickRock();
        robot.consumeBattery(batteryCost);
    }

    @Override
    public String getDescription() {
        return "Pick Up Rock";
    }
}