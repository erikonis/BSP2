package lu.uni.programming1.lab9.exercise2;

public class Main {

    public static void main(String[] args) {
        
        Character george = new Character("Georges", 100, 80);
        Character julia = new Character("Julia", 100, 90);
        Character mathsTeacher = new Character("Maths Teacher", 200, 200);
        Log log = new Log();
        
        Ability geometry = new Ability("understand triangle, rectangle, etc...");
        Ability dummy = new Ability("be dummed");
        Jump jump = new Jump();
        Targetable round1 = new Targetable("ignored", 10, george);
        Targetable round2 = new Targetable("create test", 70, julia);
        Targetable round3 = new Targetable("got 0 in maths", 200, mathsTeacher);

        round1.execute(julia,log);
        round1.execute(george,log);
        dummy.execute(george,log);
        geometry.execute(mathsTeacher,log);
        round2.execute(mathsTeacher,log);
        round1.execute(julia,log);
        round3.execute(george,log);
        jump.execute(george, log);
        round3.execute(julia,log);

        System.out.println(log);

        

    }
    
}
