public class InvalidLicenseException extends Exception {
    
    private Game game;
    private User user;

    public InvalidLicenseException(Game game, User user) {
        this.game = game;
        this.user = user;
    }

    public String getMessage() {
        return "User " + user.toString() + " does not own a valid license for " + game.getName();
    }
}
