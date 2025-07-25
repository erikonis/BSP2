package lu.uni.programming1.lab9.exercise2;

public class Launch {
    
    public static void main(String[] args) {
        final Log logger = new Log();
    
        Character char1 = new Character("char1",2,2,logger);
        Character char2 = new Character("char2",2,2,logger);
    
        Ability a1 = new Ability("ice storm",char1);
        Targetable a2 = new Targetable("Fire Ball", char1, 10);
    
        Ability[] abilities = {a1,a2};

        char1.setAbilities(abilities);
        char2.setAbilities(abilities);

        char1.useAbility("Fire Ball", char2);
        char2.jump();

        char2.useAbility("ice storm", char2);

        logger.printLogs();
    }
}
