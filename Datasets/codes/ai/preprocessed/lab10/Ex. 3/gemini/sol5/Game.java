public class Game implements Software {
    private String name;
    private String licenseId;

    public Game(String name, String licenseId) {
        this.name = name;
        this.licenseId = licenseId;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getLicenseId() {
        return licenseId;
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        // Core installation logic (could be empty here, as aspects handle it)
        return disk.installSoftware(this);
    }
}