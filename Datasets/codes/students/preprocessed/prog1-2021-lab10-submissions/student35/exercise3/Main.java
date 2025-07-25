import java.util.UUID;

public class Main {
    
    public static void main(String[] args) {

        //New User
        User Marion = new User("Marion");
        Disk diskMarion = new Disk(20, Marion, OperatingSystem.MACOS);
        Disk diskMarionLinux = new Disk(50, Marion, OperatingSystem.LINUX);
        
        // Test for game licence
        Game Civilization = new Game("CivilizationIV", 2, UUID.randomUUID());
        Game Sims = new Game("Sims4", 3, UUID.randomUUID());

        Marion.addGameLicense(Civilization.getLicense());
        
        try {
            Sims.install(diskMarion);
        } catch (Exception e) {
            System.out.println("You can't install "+ Sims.getName() +" because you don't own it.");
        }

        // Test for tool software
        Tool dezip = new Tool("Dezipper", 1);

        try {
            dezip.install(diskMarionLinux);
            dezip.install(diskMarion);
        }catch (Exception e) {
            System.out.println("You can't install it because you have "+OperatingSystem.MACOS);
        }



    }
}
