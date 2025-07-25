import java.io.IOException;

public class Launcher {
    public static void main(String[] args) throws SecurityException, IOException {
        
        Character Bob = new Character("Bob", 100, 100);
        Character VI = new Character("VI", 250, 250);
        Targetable eff = new Targetable(4);
        Ability abi1 = new Ability("Speed");
        Ability abi2 = new Ability("Heal");
        Ability abi3 = new Ability("Damage");
        Jump jump = new Jump();

        System.out.println(Bob);

        eff.add(abi1);
        eff.add(abi2);
        eff.add(abi3);

        System.out.println(eff);

        jump.use();
        eff.use(0);

        //USE Damage ABILITY ON BOB
        eff.use(2);
        Bob.curHealth = Bob.getMaxHealth()-20;
        System.out.println(Bob+"\n");

        eff.use(1);
        if(Bob.curHealth==Bob.getMaxHealth()){
            System.out.println("Bob is already full healed!");
        }else {
            System.out.println("You have been healed by 10 HP");
            Bob.curHealth = Bob.getCurHealth()+10;}
        System.out.println(Bob+"\n");
        
        //USE Damage ABILITY ON VI
        eff.use(2);
        VI.curHealth = VI.getMaxHealth()-20;
        System.out.println(VI+"\n");
    }
}
