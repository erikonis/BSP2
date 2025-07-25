public class Launcher { 
    public static void main(String[] args) {
        Character sedam = new Character("Sedam", 777);
        Character enemy = new Character("Enemy", 69);
        Logger logger = new Logger();
        
        Jump jump = new Jump();
        Ability empowering = new Ability("Empowering");
        Targetable novaBomb = new Targetable("Nova Bomb");
        Targetable goodPotion = new Targetable("Good Looking Potion");
        
        logger.log(jump.doAction(sedam));
        logger.log(empowering.doAction(sedam));
        logger.log(novaBomb.doAction(sedam,enemy,-70));
        logger.log(goodPotion.doAction(sedam,sedam,-999999));
    
    }
}
