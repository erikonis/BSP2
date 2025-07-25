public class Launcher {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Character player1 = new Character("player1", 250, 100);
        Character player2 = new Character("player2", 150, 80);

        Jump jump1 = new Jump(player2);
        Ability steal = new Ability(player1, "steal");
        Targetable heal = new Targetable(player1, "heal", player2, -250);
        Targetable swordAttack = new Targetable(player2, "sword attack", player1, 110);
        Targetable strongerSword = new Targetable(player1, "stronger sword attack", player2, 300);
        Targetable weakBow = new Targetable(player2, "weak bow attack", player1, 5);


        jump1.execute(logger);
        steal.execute(logger);
        heal.execute(logger, false);
        swordAttack.execute(logger, false);
        strongerSword.execute(logger, false);
        weakBow.execute(logger, false);

        System.out.println(logger);
    }

    
}
