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
        validateLicense(user);
        return performInstall(disk);
    }

    private void validateLicense(User user) throws GameInstallException {
        if (!user.getLicenses().contains(license)) {
            throw new GameInstallException(this, user);
        }
    }

    private InstallStatus performInstall(Disk disk) {
        return disk.installSoftware(this);
    }
}
