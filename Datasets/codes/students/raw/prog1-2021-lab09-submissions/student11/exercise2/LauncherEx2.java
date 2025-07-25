package lu.uni.programming1.lab9.exercise2;

public class LauncherEx2 {

    public static void main(String[] args) {

        log logList = new log();

        character p1 = new character("Albert Camus", 200, 120);
        character p2 = new character("Meursault", 150, 150);
        
        action jump_p1 = new jump(p1);
        action write_p1_p2 = new targetable(p1, "write", p2, 30);
        action gun_p2_p1 = new targetable(p2, "Gunshot on a hot day", p1, p1.getMaxHealth());
        action vanish_p1 = new ability(p1, "vanish");

        jump_p1.execute(logList);
        write_p1_p2.execute(logList);
        vanish_p1.execute(logList);
        gun_p2_p1.execute(logList);


        logList.printLog();

    }
    
}
