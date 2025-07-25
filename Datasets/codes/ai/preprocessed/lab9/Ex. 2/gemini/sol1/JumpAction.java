import java.util.List;

public record JumpAction(Character user) implements Action {
    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public ActionResult execute(List<Character> currentCharacters) {
        System.out.println(user.getName() + " jumps!");
        return new ActionResult(true, currentCharacters, List.of());
    }

    @Override
    public String getDescription() {
        return "Jump";
    }

    @Override
    public Character getTarget(List<Character> currentCharacters) {
        return null;
    }
}