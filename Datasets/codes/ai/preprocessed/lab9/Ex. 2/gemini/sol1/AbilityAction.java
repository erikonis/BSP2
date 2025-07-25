import java.util.List;

public record AbilityAction(Character user, String abilityName) implements Action {
    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public ActionResult execute(List<Character> currentCharacters) {
        System.out.println(user.getName() + " uses ability: " + abilityName);
        return new ActionResult(true, currentCharacters, List.of());
    }

    @Override
    public String getDescription() {
        return "Ability: " + abilityName;
    }

    @Override
    public Character getTarget(List<Character> currentCharacters) {
        return null;
    }
}