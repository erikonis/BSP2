package lu.uni.programming1.lab9.exercise2;

public class Main {

    public static void main(String[] args) {        
        Loggs logg = new Loggs();

        Character goku = new Character("Ghoku", 150, 80);
        Character hulk = new Character("Hulk", 300, 120);
    
        Action jump = new Jump(hulk);
        Action fire = new Ability("Flame", goku);
        Action kick = new Targetable(goku, fire, 30, hulk);

        logg.alList.add(kick.execute());
        logg.alList.add(jump.execute());
        System.out.println(logg.alList.toString());
    }
}
