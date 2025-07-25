public class Game extends Software {
    private final String licenseId;

    public Game(String name, String licenseId) {
        super(name);
        this.licenseId = licenseId;
    }

    @Override
    public InstallStatus install(User user, Disk disk) throws LicenseNotOwnedException {
        if (!user.ownsLicense(licenseId)) {
            throw new LicenseNotOwnedException(this, user);
        }
        return InstallStatus.SUCCESS;
    }

    public String getLicenseId() {
        return licenseId;
    }
}