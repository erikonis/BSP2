public class LicenseNotOwnedException extends Exception {
    private Game game;
    private User user;

    public LicenseNotOwnedException(Game game, User user) {
        this.game = game;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Game getGame() {
        return game;
    }


}
