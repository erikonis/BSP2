package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software {
    private UUID licence;

    public Game(String name, int size) {
        super(name, size);
        licence = UUID.randomUUID();
        // TODO Auto-generated constructor stub
    }

    public UUID getLicence() {
        return licence;
    }

    public void setLicence(UUID licence) {
        this.licence = licence;
    }

    
    public void install(Disk disk,User user)throws NoLicenceException, Exception {
        if (!user.ownsGameLicense(licence)) {
            throw new NoLicenceException("The user doesn't have this game's licence!");
        }else{
            super.install(disk);
        }
    }

}
