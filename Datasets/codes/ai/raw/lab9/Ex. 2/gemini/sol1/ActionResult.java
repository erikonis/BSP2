import java.util.List;

public record ActionResult(boolean success, List<Character> newCharacters, List<Effect> effects) {
    public ActionResult {
        newCharacters = List.copyOf(newCharacters); // Ensure immutability
        effects = List.copyOf(effects);             // Ensure immutability
    }
}