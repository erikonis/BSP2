import java.util.UUID;

public class Game extends Software {
    private UUID license=UUID.randomUUID();
    
    public UUID getLicense() {
        return license;
    }

    public Game(String name, int size) {
        super(name, size);
    }
    
    @Override
    public void install(Disk disk) throws Exception,LicenseErrorException {
        if(disk.getUser().ownsGameLicense(license)){
            super.install(disk);
        }
        else{
            throw new LicenseErrorException();
        }
    }
}
