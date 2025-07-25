// Game.java
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
        InstallationService.install(this, disk, user);
        return disk.installSoftware(this);
    }
}