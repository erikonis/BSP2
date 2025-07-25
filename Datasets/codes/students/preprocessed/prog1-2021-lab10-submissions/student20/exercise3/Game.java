import java.util.UUID;

public class Game extends Software {

    private UUID license;

    public Game(String name, int size) {
        super(name, size);
    }
    
    @Override
    public void install(Disk disk) throws LicenseNotOwnedException {
        try {
            if (disk.getUser().ownsGameLicense(license)) {
                super.install(disk);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new LicenseNotOwnedException(this, disk.getUser());
        }

        
        
    }

}
