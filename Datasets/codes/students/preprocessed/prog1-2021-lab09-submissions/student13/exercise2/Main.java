public class Main {
    
    public static void main(String[] args) {

        Logger logger= new Logger();

        Character c1 = new Character("Tomas", 150, 150);
        Character c2 = new Character("Kim", 200, 40);
        Targetable t1= new Targetable("Fire", 150);
        Jump j1= new Jump();
        Ability a1= new Ability("Water");

        //targetable ability action
        logger.createLog(t1.execute(c1, c2));

        //jump action
        logger.createLog(j1.execute(c1));

        //targetable ability action but Character is also target
        logger.createLog(t1.execute(c1, c1));

        //ability action
        logger.createLog(a1.execute(c2));

        logger.printLogs();
    }
}
