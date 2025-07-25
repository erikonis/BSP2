package lu.uni.programming1.lab10.exercise3;

public class Laucher {
    public static void main(String[] args) throws Exception {
        Game game = new Game("Star Wars", 500);
        User user1 = new User("John");
        Disk disk = new Disk(10000, user1, OperatingSystem.MACOS);
        Tool tool = new Tool("PHotoshop", 500);

        user1.addGameLicense(game.license);
        game.install(disk);
        tool.install(disk);


    }
}
