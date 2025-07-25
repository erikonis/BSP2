package lu.uni.programming1.lab9.exercise2;

public class launcher {
    public static void main(String[] args) {
        character Bob = new character("Bob", 100);
        character Jhon = new character("Jhon", 100);
        targetable tar = new targetable("Firing towards", 50);
        ability ab = new ability("Opened fire");
        jump jum = new jump();
        jum.execute(Bob);
        jum.execute(Jhon);
        ab.execute(Bob);
        tar.setTarget(Jhon);
        tar.execute(Bob);
        tar.execute(Bob);
        tar.execute(Bob);
        action.logger.printLog();
    }
}