package lu.uni.programming1.lab10.exercise3;

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
