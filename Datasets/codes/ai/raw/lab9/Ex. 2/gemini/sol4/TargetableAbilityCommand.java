public record TargetableAbilityCommand(Character source, String abilityName, String targetName, int power) implements Command {
    @Override
    public boolean execute(GameEngine engine) {
        Character target = engine.findCharacterByName(targetName);
        if (target == null) {
            System.out.println(source.getName() + " tried to use targetable ability '" + abilityName + "' on non-existent target '" + targetName + "'!");
            return false;
        }

        int initialTargetHealth = target.getCurrentHealth();
        target.takeDamage(-power); // Negative power means heal
        int finalTargetHealth = target.getCurrentHealth();

        System.out.println(source.getName() + " uses '" + abilityName + "' on " + target.getName() + " with power " + power + ".");

        // Logging kill events here, as the command knows the intent
        if (initialTargetHealth > 0 && finalTargetHealth <= 0) {
            if (!source.equals(target)) {
                engine.logKill(source, target);
            } else {
                engine.logSelfKill(source);
            }
        }
        return true;
    }

    @Override
    public String getDescription() {
        return "Targetable Ability: " + abilityName + (targetName != null ? " on " + targetName : " (no target)");
    }

    @Override
    public Character getSource() {
        return source;
    }

    @Override
    public Character getTarget() {
        return getTarget(null); // Requires engine context, so null here
    }

    public Character getTarget(GameEngine engine) {
        return (engine != null) ? engine.findCharacterByName(targetName) : null;
    }
}