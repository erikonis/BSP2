
public class Character {
    String name;
    int max_health=100,curr_health;

    public Character(String name, int curr_health) {
        this.name = name;
        this.curr_health = curr_health;
    }

    public boolean redHealth(int value){
        if (value<curr_health){
            curr_health -= value;
            return false;
        }else{
            return  true;
        }
    }

    public static void main(String[] args) {
        Character itachi = new Character("Itachi",100);
        Character naruto = new Character("Naruto",100);


        Jump jumpi = new Jump(itachi);
        Abilities iabil = new Abilities(itachi,"Sharingan");
        Targetable targetablei = new Targetable(itachi,null,50,true);
        Targetable targetablei1 = new Targetable(itachi,naruto,50,true);
        Targetable targetablei2 = new Targetable(itachi,null,50,false);


        Jump jumpn = new Jump(naruto);
        Abilities nabil = new Abilities(naruto,"Rasengan");
        Targetable targetablen = new Targetable(naruto,null,50,true);
        Targetable targetablen1 = new Targetable(naruto,itachi,50,true);
        Targetable targetablen2 = new Targetable(naruto,null,50,false);




        jumpi.execute();
        jumpn.execute();

        targetablei.execute();
        targetablei1.execute();
        targetablei2.execute();

        iabil.execute();
        nabil.execute();

        targetablen1.execute();


        Logger.printLogs();


    }


}



