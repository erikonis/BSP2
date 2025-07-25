public record AbilityCommand(Character source, String abilityName) implements Command {
    @Override
    public boolean execute(GameEngine engine) {
        System.out.println(source.getName() + " uses ability: " + abilityName);
        return true;
    }

    @Override
    public String getDescription() {
        return "Ability: " + abilityName;
    }

    @Override
    public Character getSource() {
        return source;
    }

    @Override
    public Character getTarget() {
        return null;
    }
}