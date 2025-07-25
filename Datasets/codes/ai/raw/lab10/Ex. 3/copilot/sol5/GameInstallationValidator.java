public class GameInstallationValidator implements InstallationValidator {
    private Game game;

    public GameInstallationValidator(Game game) {
        this.game = game;
    }

    @Override
    public void validate(Disk disk, User user) throws LicenseException {
        if (!user.ownsLicense(game.getLicenseId())) {
            throw new LicenseException(game, user);
        }
    }
}