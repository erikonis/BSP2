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
    public InstallStatus install(Disk disk, User user) throws LicenseExceptionImpl {
        if (!user.ownsLicense(licenseId)) {
            LicenseExceptionImpl exception = new LicenseExceptionImpl(this, user);
            System.err.println("Installation failed: " + exception.getMessage());
            throw exception;
        }
        System.out.println("Installing game " + getName() + " to disk " + disk.getName());
        return super.install(disk, user);
    }
}