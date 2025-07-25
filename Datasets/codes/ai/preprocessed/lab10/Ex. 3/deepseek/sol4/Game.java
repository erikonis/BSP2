import java.util.UUID;

public class Game extends Software {
    private final UUID license;

    public Game(String name, int size, UUID license) {
        super(name, size);
        this.license = license;
    }

    @Override
    public void install(Disk disk) throws GameLicenseException, InstallationException {
        // Check if user owns the game license
        if (!disk.getUser().ownsGameLicense(license)) {
            throw new GameLicenseException(this, disk.getUser());
        }

        // Proceed with normal installation
        super.install(disk);
    }

    public UUID getLicense() {
        return license;
    }
}