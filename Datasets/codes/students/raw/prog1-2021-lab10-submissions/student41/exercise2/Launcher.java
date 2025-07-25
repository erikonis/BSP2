package lu.uni.programming1.lab10.exercise2;

public class Launcher {
    public static void main(String[] args) {
        Dummy sara = new Dummy("sara", 72);
        Human notSara = new Human("notSara", 50);
        Human h2 = new Human("DUmby", 5);
        Angel a1 = new Angel(25);
        Object o1 = new Object();
        EvaUnit<Human> e1 = new EvaUnit<Human>(1, 50);
        EvaUnit<Dummy> e2 = new EvaUnit<Dummy>(2, 70);
        EvaUnit<Human> e3 = new EvaUnit<Human>(3, 100);

        e1.setStatus(e1.start());
        e1.setPilot(notSara);
        e1.setStatus(e1.start());
        e1.dodge(o1);
        e1.dodge(a1);
        e1.dodge(o1);
        e1.dodge(a1);
        e1.dodge(a1);
        e1.dodge(a1);
        e1.dodge(a1);
        // e2.setPilot(notSara); error
        e2.setPilot(sara);
        e2.setStatus(e2.start());
        e2.dodge(o1);
        e2.dodge(a1);
        e3.setPilot(h2);
        e3.setStatus(e3.start());

    }
}
