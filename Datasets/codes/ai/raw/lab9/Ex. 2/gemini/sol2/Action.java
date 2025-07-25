public interface Action {
    Character getUser();
    boolean execute();
    String getDescription();
    Target getTarget();
}