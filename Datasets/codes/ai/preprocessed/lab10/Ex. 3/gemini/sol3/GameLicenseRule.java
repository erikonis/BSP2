public class GameLicenseRule implements InstallationRule {
    @Override
    public boolean isApplicable(Software software) {
        return software instanceof Game;
    }

    @Override
    public void check(Software software, Disk disk, User user) throws InstallationException {
        Game game = (Game) software;
        if (user == null || !user.hasLicense(game.getLicenseId())) {
            throw new GameLicenseException("User does not own the license for the game.", game, user);
        }
    }
}