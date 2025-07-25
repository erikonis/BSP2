package lu.uni.programming1.lab9.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Logbook {


    ArrayList<String> logbook = new ArrayList<>();

    public Logbook() {
        logbook = new ArrayList<>();
    }

    public void logAction(String string) {
        logbook.add(string);
    }

    public void logKill(Character character, Character killedCharacter) {
        logbook.add("\t" + LocalDate.now() + " : " + character.getName() + " killed " + killedCharacter.getName());
    }

    public void showLogs() {
        System.out.println("\t\t--- Action history ---");
        for (String string : logbook) {
            System.out.println(string);
        }
        System.out.println("\t\t----------------------");
    }
}
