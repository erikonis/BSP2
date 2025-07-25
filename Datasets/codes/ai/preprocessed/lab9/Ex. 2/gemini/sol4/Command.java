public interface Command {
    boolean execute(GameEngine engine);
    String getDescription();
    Character getSource();
    Character getTarget(); // Optional target
}