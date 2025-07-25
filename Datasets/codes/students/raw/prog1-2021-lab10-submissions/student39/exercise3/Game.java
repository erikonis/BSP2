package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software{

    private UUID license;
    public Game(String name, int size) {
        super(name, size);
        this.license = UUID.randomUUID();
    }

    public UUID getLicense() {
        return license;
    }

    @Override
    public void install(Disk disk) throws Exception {
        if(disk.getUser().ownsGameLicense(license)) {
            switch (disk.install(this)) {
                case ALREADYINSTALLED:
                    System.out.println("Can't install " + this.getName() + " to " + disk + ": already installed.");
                    break;
                case INSUFFICIENTSPACE:
                    System.out.println("Can't install " + this + " to " + disk + ": insufficient space.");
                    break;
                case SUCCESS:
                    System.out.println("Installed " + this + " to " + disk);
                }
        }
        else {
            throw new InvalidLicenseException(this, disk.getUser());
        }
    }
}
