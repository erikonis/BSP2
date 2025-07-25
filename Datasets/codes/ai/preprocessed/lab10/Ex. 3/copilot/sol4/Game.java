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
    public void validateInstallation(Disk disk, User user) throws LicenseException {
        if (!user.ownsLicense(licenseId)) {
            throw new LicenseException(this, user);
        }
    }
}