public class Launcher {public static void main(String[] args) {
    
    User user = new User("user1");

    Disk disk = new Disk(2046, user, OperatingSystem.LINUX);

    Game game = new Game("Snake",100);

    Tool tool = new Tool("tool1",20);

    try {
        game.install(disk);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    user.addGameLicense(game.getgameLicense());

    try {
        game.install(disk);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    try {
        tool.install(disk);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
    
}
