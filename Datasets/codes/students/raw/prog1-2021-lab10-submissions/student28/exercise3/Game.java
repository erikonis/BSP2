package lu.uni.programming1.lab10.exercise3;
import java.util.UUID;

public class Game extends Software{
    private UUID license;

    public Game(String name, int size, UUID license) {
        super(name, size);
        this.license = license;
    }

    public UUID getLicense() {
        return license;
    }

    public void setLicense(UUID license) {
        this.license = license;
    }
    
    public void install(Disk disk) throws Exception {
        switch (disk.install(Game game_, User user_)) {
        case NOLICENSE:
            System.out.println("Can't install " + this );
            break;
        case SUCCESS:
            System.out.println("Installed " + this );
        }
    }
    
}
