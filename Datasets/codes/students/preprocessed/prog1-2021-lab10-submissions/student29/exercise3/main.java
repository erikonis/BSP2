import java.util.UUID;

public class main {
    static User usr = new User("eldar", OS.WINDOWS);

    static Game game1 = new Game(UUID.randomUUID(),17,"game1");
    static Game game2 = new Game(UUID.randomUUID(),21,"game2");
    static Game game3 = new Game(UUID.randomUUID(),20,"game3");

    static Tool tool1 = new Tool(UUID.randomUUID(),3,"Wallpaper Engine");

    public static void main(String[] args) {
        usr.Print();
        install();
    }

    public static void install(){
        Game.Install(game1);
        Game.Install(game2);
        Game.Install(game3);
        tool1.Install(tool1);
    }
}
