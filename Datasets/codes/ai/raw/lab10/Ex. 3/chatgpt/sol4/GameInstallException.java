public class GameInstallException extends Exception {
    private final Game game;
    private final User user;

    public GameInstallException(Game game, User user) {
        super("User " + user.getUsername() + " does not own license for game: " + game.getName());
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
