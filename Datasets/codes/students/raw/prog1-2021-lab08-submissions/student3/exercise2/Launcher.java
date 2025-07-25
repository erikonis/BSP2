package lu.uni.programming1.lab8.exercise2;

public class Launcher {

    public static void main(String[] args) {
        Order o1 = new Order("WEED", 800, 20);
        Order o2 = new Order("Coke", 1500, 12);
        Order o3 = new Order("Meth", 1750, 5);
        Order o4 = new Order("LSD", 10, 200);
        Order o5 = new Order("WEED", 800, 20);

       Order[] List1 = {o1, o2, o3, o4, o5};

       System.out.println(List1);
    }
    
}
