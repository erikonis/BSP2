package lu.uni.programming1.lab8.exercise1;

public class LauncherEx1 {

    public static void main(String[] args) {

        person p1 = new person("Roland", "43, rue de Strassen", Country.Germany);
        item i1 = new item("4x2 Wooden Plank", 20);

        order o1 = new order(p1, i1, Handling.PRIORITY);

        o1.launchShipping();
    
    }
}