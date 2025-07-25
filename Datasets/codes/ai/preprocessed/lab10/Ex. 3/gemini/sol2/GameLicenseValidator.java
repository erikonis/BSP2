public class GameLicenseValidator implements SoftwareInstallValidator {
    private Game game;

    public GameLicenseValidator(Game game) {
        this.game = game;
    }

    @Override
    public void validate(Disk disk, User user) throws InstallationException {
        if (user == null || !user.hasLicense(game.getLicenseId())) {
            throw new GameLicenseException("User does not own the license for the game.", game, user);
        }
    }
}