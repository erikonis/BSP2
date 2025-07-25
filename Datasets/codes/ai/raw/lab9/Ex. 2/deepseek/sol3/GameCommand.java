public interface GameCommand {
    CommandResult execute();
    Character getActor();
}