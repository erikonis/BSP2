public class Main {
    public static void main(String[] args) {
        Game game=new Game("CS:GO", 150);
        Tool tool = new Tool("Blender", 468);
        User user = new User("BOB");
        Disk disk = new Disk(100, new User("PIT"), OperatingSystem.LINUX);
        user.addGameLicense(game.getLicence());
        //System.out.println(user.ownsGameLicense(game.getLicence()));
        try{
            game.install(disk, user);
            tool.install(disk);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
