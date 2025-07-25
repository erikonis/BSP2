import java.util.UUID;

public class Game extends Software {
    private final UUID license;

    public Game(String name, int size, UUID license) {
        super(name, size);
        this.license = license;
    }

    @Override
    public void install(Disk disk) throws GameLicenseException, Exception {
        if (!disk.getUser().ownsGameLicense(license)) {
            throw new GameLicenseException(this, disk.getUser());
        }
        super.install(disk);
    }

    public UUID getLicense() {
        return license;
    }
}