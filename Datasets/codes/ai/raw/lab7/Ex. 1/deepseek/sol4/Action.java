public interface Action {
    void execute(RobotState state);
    int getBatteryCost();
    String getActionName();
}