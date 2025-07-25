import java.util.UUID;

public class Game extends Software {
    private final UUID gameLicense;

    public Game(String name, int size, UUID license) {
        super(name, size);
        this.gameLicense = license;
    }

    @Override
    public void install(Disk targetDisk) throws LicenseValidationException, InstallationException {
        validateLicense(targetDisk.getUser());
        super.install(targetDisk);
    }

    private void validateLicense(User user) throws LicenseValidationException {
        if (!user.ownsGameLicense(gameLicense)) {
            throw new LicenseValidationException(this, user);
        }
    }

    public UUID getLicense() {
        return gameLicense;
    }
}