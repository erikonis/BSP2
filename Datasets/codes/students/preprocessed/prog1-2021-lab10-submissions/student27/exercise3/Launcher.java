public class Launcher {
    public static void main(String[] args) {
        
        Game starbound = new Game("Starbound", 2);
        Game outlast = new Game("Outlast", 5);
        Game eldenRing = new Game("Elden Ring", 25);
        Game finalFantasyV = new Game("Final Fantasy V", 1);
        Game witcher3 = new Game("The Witcher 3", 35);
        Game memoryDead = new Game("Memory Death", 1024);

        Tool t1 = new Tool("Simple Tools", 1);
        Tool t2 = new Tool("Modding", 5);
        Tool t3 = new Tool("ShadderTool", 1);

        User me = new User("Ben");
        Disk myDisk = new Disk(1024, me, OperatingSystem.WINDOWS);
        User he = new User("Albus");
        Disk hisDisk = new Disk(1024, he, OperatingSystem.LINUX);
        User she = new User("Molly");
        Disk herDisk = new Disk(1024, she, OperatingSystem.MACOS);
        User they = new User("Snape");
        Disk theirDisk = new Disk(1024, they, OperatingSystem.MACOS);

        try {
            me.addGameLicense(starbound.buy());
            me.addGameLicense(eldenRing.buy());
            me.addGameLicense(witcher3.buy());
            starbound.install(myDisk,me.ownsGameLicense(starbound.getLicense()));
            outlast.install(myDisk, me.ownsGameLicense(outlast.getLicense()));
            witcher3.install(myDisk, me.ownsGameLicense((witcher3.getLicense())));
            t1.install(myDisk);
            
            System.out.println("\n");
            
            he.addGameLicense(finalFantasyV.buy());
            he.addGameLicense(starbound.buy());
            finalFantasyV.install(hisDisk,he.ownsGameLicense(finalFantasyV.getLicense()));
            starbound.install(hisDisk, he.ownsGameLicense(starbound.getLicense()));
            starbound.install(hisDisk, he.ownsGameLicense(starbound.getLicense()));
            
            System.out.println("\n");
           
            she.addGameLicense(memoryDead.buy());
            she.addGameLicense(witcher3.buy());
            memoryDead.install(herDisk, she.ownsGameLicense(memoryDead.getLicense()));
            witcher3.install(herDisk, she.ownsGameLicense((witcher3.getLicense())));

            System.out.println("\n");
            
            they.addGameLicense(eldenRing.buy());
            eldenRing.install(theirDisk , they.ownsGameLicense(eldenRing.getLicense()));
            eldenRing.install(theirDisk , they.ownsGameLicense(eldenRing.getLicense()));
            t2.install(theirDisk);
            t3.install(theirDisk);

        } catch (Exception e) {
            
        }

    }
}
