package lu.uni.programming1.lab10.exercise1;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        Scanner scanner = new Scanner(System.in);
        int readNumber;
        //Character[] group = new Character[1000];
        Party Party1 = new Party();
        Party Party2 = new Party();


            do {
                System.out.println("Commands:\n0 - Exit \n1 - Create new character \n2 - Show party");
                readNumber = scanner.nextInt();
                switch (readNumber){
                    case 0:
                        break;
                    case 1:
                        int partyNumber;
                        String name_ = null;
                        CharacterRole role_ = null;
                        Character A = new Character(name_, role_);
                        A.addmember(A);
                        System.out.println("Add to party (1 or 2):");
                        partyNumber = scanner.nextInt();
                        if(partyNumber ==1){
                            Party1.add(A);
                        } else if (partyNumber ==2){
                            Party2.add(A);
                        } //else{
                           // throw new notCommandID();
                        //} 
                        break;
                    case 2:
                        System.out.println(Party1.toString());
                        System.out.println(Party2.toString());
                        break;
                    default:
                    break;
                        //throw new notCommandID();
                }
            }
        
            while (readNumber<3&&readNumber>0);


}
    
} 
    
