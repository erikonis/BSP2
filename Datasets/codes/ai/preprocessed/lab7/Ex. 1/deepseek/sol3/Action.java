public interface Action {
    void execute(Robot robot);
    int getCost();
    String getName();
}