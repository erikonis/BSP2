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
        SoftwareInstaller installer = new ConcreteSoftwareInstaller();
        return installer.install(this, disk, user);
    }

    @Override
    public void accept(SoftwareVisitor visitor, Disk disk, User user) throws InstallationException {
        visitor.visit(this, disk, user);
    }
}