package lu.uni.programming1.lab7.exercise1;

import java.util.*;

public class Robot {
    ArrayList<Action> alList = new ArrayList<>();

    // robot has a battery life of 3000 seconds.
    private int batteryLife = 3000;

    public void move(Action[] set) {

        Collections.addAll(alList, set);
        if (set.length < 11 && set.length > 0) {
            for (Action c : alList) {
                int currentlylife = 0;
                if (getBatteryLife() == 0) {
                    System.out.println("The robot has no more battery.!!");
                    break;
                } else {
                    currentlylife = c.execute();
                    if (getBatteryLife() >= currentlylife) {
                        setBatteryLife(getBatteryLife() - c.execute());
                        System.out.println(c.text());
                    } else {
                        System.out.println("Sorry, you don't have enough battery for the next step.!!");
                        break;
                    }
                }
            }
            System.out.println("* * * * * * * * * * * * * * * * * * *");

            System.out.println("Remaining battery time: " + getBatteryLife());

            System.out.println("* * * * * * * * * * * * * * * * * * *");
        } else if (set.length < 1) {
            System.out.println("You didn't give a single command.!");
        } else {
            System.out.println("You have entered too many commands, only 10 are allowed.!! ");
        }
    }

    public void reset() {
        alList.clear();
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int life) {
        batteryLife = life;
    }
}
