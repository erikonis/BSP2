public class Game extends Software {
    private final String license;

    public Game(String name, String license) {
        super(name);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    @Override
    public InstallStatus install(User user, Disk disk) throws GameInstallException {
        if (!user.getLicenses().contains(license)) {
            throw new GameInstallException(this, user);
        }
        return disk.installSoftware(this);
    }
}
