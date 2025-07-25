public class Game extends Software {
    private String licenseId;
    private SoftwareInstallValidator licenseValidator;

    public Game(String name, String licenseId) {
        super(name);
        this.licenseId = licenseId;
        this.licenseValidator = new GameLicenseValidator(this);
    }

    public String getLicenseId() {
        return licenseId;
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        licenseValidator.validate(disk, user);
        return disk.installSoftware(this);
    }
}