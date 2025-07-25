import java.util.UUID;

public class Game extends Software{
    UUID license;

    public Game(String name, int size) {
        super(name, size);
        license = UUID.randomUUID();
    }

    @Override
    public void install(Disk disk) throws Exception {
        try {
            checkLicense(disk);
        } catch (LicenseException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        } 
        switch (disk.install(this)) {
        case ALREADYINSTALLED:
            System.out.println("Can't install " + super.getName() + " to " + disk + ": already installed.");
            break;
        case INSUFFICIENTSPACE:
            System.out.println("Can't install " + this + " to " + disk + ": insufficient space.");
            break;
        case SUCCESS:
            System.out.println("Installed " + this + " to " + disk);
        }
    }

    public void checkLicense(Disk disk) throws Exception{
        if(disk.getUser().ownsGameLicense(license))
            System.out.println("License found");
        else
            throw new LicenseException("License of "+super.getName()+" not acquired by "+disk.getUser().toString());
    }
}
