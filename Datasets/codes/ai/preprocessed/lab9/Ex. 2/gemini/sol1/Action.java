import java.util.List;

public interface Action {
    Character getUser();
    ActionResult execute(List<Character> currentCharacters);
    String getDescription();
    Character getTarget(List<Character> currentCharacters);
}