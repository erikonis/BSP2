import java.util.Set;

public class Game extends Software {
    private final String licenseKey;

    public Game(String name, String licenseKey) {
        super(name);
        this.licenseKey = licenseKey;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    @Override
    public InstallStatus install(User user, Disk disk) throws GameInstallException {
        Set<String> ownedLicenses = user.getLicenses();
        if (!ownedLicenses.contains(licenseKey)) {
            throw new GameInstallException(this, user);
        }
        return disk.installSoftware(this);
    }
}
