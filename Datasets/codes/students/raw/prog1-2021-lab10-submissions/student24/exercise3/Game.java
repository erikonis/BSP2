package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software {

    private UUID license;
    
    public Game(String name, int size, UUID license) {
        super(name, size);
        this.license = license;
    }

    @Override
    public void install(Disk disk) throws Exception {
        if (disk.getUser().ownsGameLicense(license)) {
            super.install(disk);
        } else {
            throw new SoftwareNotInstallableException(disk, this);
        }
    }
    
}
