// ConcreteSoftwareInstaller.java
public class ConcreteSoftwareInstaller implements SoftwareVisitor {

    @Override
    public void visit(Game game, Disk disk, User user) throws InstallationException {
        if (user == null || !user.hasLicense(game.getLicenseId())) {
            throw new GameLicenseException("User does not own the license for the game.", game, user);
        }
        // Actual installation logic would go here or be delegated
    }

    @Override
    public void visit(Tool tool, Disk disk, User user) throws InstallationException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new MacOSNotSupportedException("Tool cannot be installed on MacOS.", tool, disk);
        }
        // Actual installation logic would go here or be delegated
    }

    // This method in the installer now handles the actual disk installation
    public InstallStatus install(Software software, Disk disk, User user) throws InstallationException {
        software.accept(this, disk, user); // Visit the software to perform checks
        return disk.installSoftware(software); // Proceed with installation if checks pass
    }
}