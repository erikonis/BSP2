package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        Scanner scanner = new Scanner(System.in);
        Party party1 = new Party();
        Party party2 = new Party();
        int i = 1;
        while (i != 0) {
            System.out.println("Press 0 to exit the program or 1 to add a Character");
            int response = scanner.nextInt();
            if (response == 0) {
                i = 0;
                System.out.println(System.lineSeparator() + " Thank you for your Input");
            }
            if (response == 1) {
                System.out.println(" Enter the characters name: ");
                String name = scanner.next();
                if (name.isEmpty() || name.length() > 20) {
                    int namecorr = 1;
                    while (namecorr != 0) {
                        System.out.println(" Enter the characters name: ");
                        String name2 = scanner.next();
                        if (name2.isEmpty() || name.length() > 20) {

                        } else {
                            namecorr = 0;
                            name = name2;
                        }
                    }
                }
                System.out.println(" Enter the characters role( (0) for DAMAGE, (1) for TANK ) and (2) for HEALER)");
                int input= scanner.nextInt();
                Character newchar=null;
               if(input==0)
               {
                newchar = new Character(name, CharacterRole.DAMAGE);
                System.out.println(newchar.getName());
               }
               if(input==1)
               {
                newchar = new Character(name, CharacterRole.TANK);
               }
               if(input==2)
               {
                newchar = new Character(name, CharacterRole.HEALER);
               }
               
               
               System.out.println("Which party schould the Character be added. Enter (1) for Party 1 and (2) for  Party 2: ");
               int party=scanner.nextInt();
               if(party==1)
               {
                   party1.add(newchar);
               }
               if(party==2)
               {
                   party2.add(newchar);
               }

               System.out.println("Which party schould be shown. Enter (1) for Party 1 and (2) for  Party 2: ");
               int partyshow=scanner.nextInt();
               if(partyshow==1)
               {
                   System.out.println(party1.toString());
               }
               if(partyshow==2)
               {
                   System.out.println(party2.toString());
               }
                

            }
        }
    }
}
