public class Game extends Software {
    private String licenseId;

    public Game(String name, String licenseId) {
        super(name);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    private void validateLicense(User user) throws LicenseException {
        if (!user.ownsLicense(licenseId)) {
            throw new LicenseException(this, user);
        }
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws LicenseException {
        validateLicense(user);
        System.out.println("Installing game " + getName() + " to disk " + disk.getName());
        return super.install(disk, user);
    }
}