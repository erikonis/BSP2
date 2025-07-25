public class Main {
    public static void main(String[] args) {
        User user = new User("Alice");
        Disk disk = new Disk(OperatingSystem.WINDOWS);
        Game game = new Game("AwesomeGame", "12345");
        Tool tool = new Tool("UsefulTool");

        try {
            game.install(disk, user);
            System.out.println("Game installed successfully.");
        } catch (LicenseException e) {
            System.out.println(e.getMessage());
        }

        try {
            tool.install(disk, user);
            System.out.println("Tool installed successfully.");
        } catch (OperatingSystemException e) {
            System.out.println(e.getMessage());
        }
    }
}
