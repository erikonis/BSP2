public class Game extends Software {
    private String licenseId;

    public Game(String name, String licenseId) {
        super(name);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        if (user == null || !user.hasLicense(this.licenseId)) {
            throw new GameLicenseException("User does not own the license for the game.", this, user);
        }
        return disk.installSoftware(this);
    }
}