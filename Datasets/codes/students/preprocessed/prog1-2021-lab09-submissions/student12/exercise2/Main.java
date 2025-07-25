public class Main {public static void main(String[] args) {
    
    Character player1= new Character("Player1", 200);
    Character player2= new Character("Player2", 200);
    Character player3= new Character("Player3", 200);

    Records record = Records.getInstance();

    Jump jump1= new Jump(player1);
    jump1.execute();

    Ability fly = new Ability(AbilityName.FLY, player2);

    fly.execute();

    TargetableAction poison = new TargetableAction(AbilityName.FIGHT,player1,player3,-50);

    poison.execute();


    TargetableAction health_potion = new TargetableAction(AbilityName.RESURRECT,player1,player2,20);

    health_potion.execute();

    System.out.println(record.toString());

    System.out.println(player3.toString());
}
    
}
