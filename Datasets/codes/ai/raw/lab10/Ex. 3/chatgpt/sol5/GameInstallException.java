public class GameInstallException extends Exception {
    private final Game game;
    private final User user;

    public GameInstallException(Game game, User user) {
        super(String.format("User '%s' does not own license '%s' for game '%s'",
                user.getUsername(), game.getLicense(), game.getName()));
        this.game = game;
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public User getUser() {
        return user;
    }
}
