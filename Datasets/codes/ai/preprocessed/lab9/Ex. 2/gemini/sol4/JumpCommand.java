public record JumpCommand(Character source) implements Command {
    @Override
    public boolean execute(GameEngine engine) {
        System.out.println(source.getName() + " jumps!");
        return true;
    }

    @Override
    public String getDescription() {
        return "Jump";
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