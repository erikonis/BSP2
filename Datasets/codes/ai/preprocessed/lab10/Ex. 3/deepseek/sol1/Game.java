import java.util.UUID;

public class Game extends Software {
    private final UUID license;

    public Game(String name, int size, UUID license) {
        super(name, size);
        this.license = license;
    }

    public UUID getLicense() {
        return license;
    }

    @Override
    public void install(Disk disk) throws GameLicenseException {
        if (!disk.getUser().ownsGameLicense(license)) {
            throw new GameLicenseException("User doesn't own license for this game", this, disk.getUser());
        }
        try {
            super.install(disk);
        } catch (Exception e) {
            throw e; // Re-throw any exceptions from Software.install()
        }
    }
}