package lu.uni.programming1.lab9.exercise3.Exercise2;

public class Launcher {
    public static void main(String[] args){
        Log log = new Log();

        Character char1 = new Character("Jett", 150, 134);
        Character char2 = new Character("Sage", 150, 100);

        log.setLog(new Targetable(char1, char2, -80, "blade storm"));
        log.setLog(new Targetable(char2, char2, 100, "healing orb"));
        log.setLog(new Jump(char1));
        log.setLog(new Targetable(char2, char1, -160, "one tap"));

        log.print();
    }
}
