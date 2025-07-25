import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Test {

    public static int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
          .findFirst()
          .getAsInt();
    }


    public static void main(String[] args) {
        
        Ability spacelaser = new Ability("Shooting Space Laser! ", 20) ; 

        Ability magicwand = new Ability("Hocus pocus! ", 15);



        Character Bingo = new Character("Bingo111", 100, 80, spacelaser); 

        Character Dingo = new Character("Dingo999", 120, 70, magicwand);

        Attack at1 = new Attack(); 


        Logger testLogger = new Logger();

        boolean turn =false; 

        for (int i=0; i<20; i++)

        {

            if (turn==false ) {
                
                
                
                Targetable temptarget = new Targetable(Bingo, Dingo, at1);
                System.out.println(" / ");
            
            
            
            }

            else {
                
                
                System.out.print("                                                   <<  ");
                
                Targetable temptarget2 = new Targetable(Dingo, Bingo, at1);

            
            
            
            };



            try {
                TimeUnit.MILLISECONDS.sleep(getRandomNumberUsingInts(100, 1500));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }  

            

            turn=!turn; 
        };





    }
    
}
