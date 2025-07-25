import java.util.UUID;

public class Game extends Software{

    UUID licenseID; 

    public Game(String name, int size) {
        super(name, size);

    }


    @Override
    public void install(Disk disk) throws Exception {
        super.install(disk);
    


    }
    
}
