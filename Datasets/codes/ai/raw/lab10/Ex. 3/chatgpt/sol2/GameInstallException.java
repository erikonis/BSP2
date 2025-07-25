public class GameInstallException extends Exception {
    private final Game game;
    private final User user;

    public GameInstallException(Game game, User user) {
        super("User does not own the license for the game.");
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
