import java.time.LocalDate;


public class launcher {
    public static void main(String[] args) {
        Character character= new Character("Josh", 300);
        Character otherchar= new Character("Allah", 500);
        log log= new log();
       Targetable target= new Targetable(LocalDate.now(), character, 200);
       log.add(target.toString());
       Jump jump= new Jump(LocalDate.now(), character);
       log.add(jump.toString());
       Targetable othertarget= new Targetable(LocalDate.now(), character, otherchar, 500);
       log.add(othertarget.toString());
       log.print();


    }
}
