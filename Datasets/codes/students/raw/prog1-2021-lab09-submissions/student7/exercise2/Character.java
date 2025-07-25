package lu.uni.programming1.lab9.exercise2;

public class Character {
    static String name = "Cloud";

    static int maxHP = 100;
 
    static int HP = 100;
 
    public static String getName() {
        return name;
    }
       
    public static int getMaxHP() {
        return maxHP;
    }
       
    public static int getHP() {
        return HP;
    }

    public static void setHP(int hP) {
        HP = hP;
    }


}
