public class GameInstallException extends Exception {
    private final Game game;
    private final User user;

    public GameInstallException(Game game, User user) {
        super("Installation failed: user does not own the game's license.");
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
