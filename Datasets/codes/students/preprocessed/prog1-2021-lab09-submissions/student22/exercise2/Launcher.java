public class Launcher {
    public static void main(String[] args) {
        Character main = new Character("Alex", 100);
        Character dragon = new Character("Ryuk", 2000);
        Jump jump = new Jump();
        Ability cheer = new Ability("Cheers");
        Targetable snipe = new Targetable("Snipe",100);

        jump.execute(main);
        cheer.execute(main);
        snipe.execute(main,dragon);
        snipe.execute(main,main);
        snipe.execute(dragon);
        jump.execute(main);
        jump.execute(dragon);
    }
}
