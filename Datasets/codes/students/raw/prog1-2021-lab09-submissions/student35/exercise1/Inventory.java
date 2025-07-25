package lu.uni.programming1.lab9.exercise1;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private static List<item> inventory = new LinkedList<item>();
    private static int index;
    private static item item;

    public static boolean add(item item) {
        inventory.add(item);
        return true;
    }

    public static int drop(item item) {
        return index;
    }

    public static boolean drop(int index) {
        inventory.remove(index);
        return true;
    }

    public static void use(int index) {
        System.out.println("used" + item.getName());
    }

    public static boolean sell(int index) {
        return true;
    }

    public static List<item> getInventory() {
        return inventory;
    }
}