import java.util.UUID;

public class Launcher {
    public static void main(String[] args) {
        User user1 = new User("test");
        //user1.addGameLicense(new UUID(1, 1));
        Disk disk1 = new Disk(1000, user1, OperatingSystem.MACOS);
        Tool tool = new Tool("wtv3d", 1);
        Game game = new Game("Wolverine 3d", 1, new UUID(1, 1));
        tool.install(disk1);
        game.install(disk1);
    }
}
