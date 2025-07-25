public final class JumpCommand implements GameCommand {
    private final Character actor;
    private final Instant timestamp;

    public JumpCommand(Character actor) {
        this.actor = Objects.requireNonNull(actor);
        this.timestamp = Instant.now();
    }

    @Override
    public CommandResult execute() {
        return new CommandResult(true, actor.getName() + " jumped", actor, null);
    }

    @Override
    public Character getActor() { return actor; }
}