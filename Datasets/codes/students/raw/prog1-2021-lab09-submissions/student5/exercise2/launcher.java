package lu.uni.programming1.lab9.exercise2;

public class launcher {
    public static void main(String[] args) {
        character Alex = new character("Alex", 50);
        character Roby = new character("Roby", 100);
        targetable tar = new targetable("Firing towards", 50);
        ability ab = new ability("Opened fire");
        jump jum = new jump();
        jum.execute(Alex);
        jum.execute(Roby);
        ab.execute(Alex);
        tar.setTarget(Roby);
        tar.execute(Alex);
        tar.execute(Alex);
        tar.execute(Alex);
        action.logger.printLog();
    }
}