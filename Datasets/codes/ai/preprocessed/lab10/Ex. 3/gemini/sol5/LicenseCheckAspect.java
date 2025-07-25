public class LicenseCheckAspect implements InstallationAspect {
    @Override
    public InstallStatus aroundInstall(Software software, Disk disk, User user, InstallationInvocation invocation) throws InstallationException {
        if (software instanceof Game) {
            Game game = (Game) software;
            if (user == null || !user.hasLicense(game.getLicenseId())) {
                throw new GameLicenseException("User does not own the license for the game.", game, user);
            }
        }
        return invocation.invoke(software, disk, user); // Proceed to the next aspect or core logic
    }
}