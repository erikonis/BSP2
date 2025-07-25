package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Launcher {
    public static void main(String[] args) throws Exception {
        User Steven = new User("Steven");
        User Felix = new User("Felix");

        Disk MacBook = new Disk(70, Steven, OperatingSystem.MACOS);
        Disk Desktop = new Disk(1250, Felix, OperatingSystem.WINDOWS);

        UUID finalFantasyID = UUID.randomUUID();
        UUID terrariaID = UUID.randomUUID();

        Game finalFantasy = new Game("Final Fantasy", 80, finalFantasyID);
        Game terraria = new Game("Terraria", 3, terrariaID);

        Tool wallpaperEngine = new Tool("Wallpaper Engine", 1);

        Steven.addGameLicense(finalFantasyID);
        Steven.addGameLicense(terrariaID);

        Felix.addGameLicense(terrariaID);

        try {
            terraria.install(Desktop);
            terraria.install(MacBook);
            finalFantasy.install(MacBook);
            // finalFantasy.install(Desktop);
            // wallpaperEngine.install(MacBook);
            wallpaperEngine.install(Desktop);
        } catch (SoftwareNotInstallableException softwareNotInstallableException) {
            if (softwareNotInstallableException.getSoftware().getClass() == Game.class) {
                System.err.println("The game " + softwareNotInstallableException.getSoftware().getName() + " cannot be installed because " + softwareNotInstallableException.getUser() + " does not own it.");
            } else {
                System.err.println("The tool " + softwareNotInstallableException.getSoftware().getName() + " cannot be installed on macOS.");
            }
        }


    }
}
