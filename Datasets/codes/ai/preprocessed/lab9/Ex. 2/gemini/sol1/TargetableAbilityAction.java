import java.util.List;
import java.util.Optional;

public record TargetableAbilityAction(Character user, String abilityName, String targetName, int power) implements Action {
    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public ActionResult execute(List<Character> currentCharacters) {
        Optional<Character> targetOptional = currentCharacters.stream()
                .filter(c -> c.getName().equals(targetName()))
                .findFirst();

        if (targetOptional.isEmpty()) {
            System.out.println(user.getName() + " tried to use targetable ability '" + abilityName + "' but target '" + targetName() + "' not found!");
            return new ActionResult(false, currentCharacters, List.of());
        }

        Character target = targetOptional.get();
        List<Character> newCharacters = currentCharacters.stream()
                .map(c -> c.equals(target) ? c.withHealthChanged(-power) : c)
                .toList();

        Effect effect = (power >= 0) ? new DamageEffect(power, target) : new HealEffect(-power, target);
        Optional<Character> updatedTargetOptional = newCharacters.stream()
                .filter(c -> c.getName().equals(targetName()))
                .findFirst();

        List<Effect> effects = new java.util.ArrayList<>(List.of(effect));
        if (updatedTargetOptional.isPresent() && !updatedTargetOptional.get().isAlive() && currentCharacters.stream().anyMatch(c -> c.getName().equals(targetName()) && c.isAlive())) {
            effects.add(new KillEffect(user, target));
        }

        System.out.println(user.getName() + " uses '" + abilityName + "' on " + target.getName() + " with power " + power + ".");
        return new ActionResult(true, newCharacters, List.copyOf(effects));
    }

    @Override
    public String getDescription() {
        return "Targetable Ability: " + abilityName + (targetName != null ? " on " + targetName : " (no target)");
    }

    @Override
    public Character getTarget(List<Character> currentCharacters) {
        return currentCharacters.stream()
                .filter(c -> c.getName().equals(targetName()))
                .findFirst()
                .orElse(null);
    }
}