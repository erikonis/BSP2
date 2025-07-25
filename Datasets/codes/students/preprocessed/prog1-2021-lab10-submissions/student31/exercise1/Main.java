

import java.util.ArrayList;
import java.util.Scanner;





public class Main {




public static void main(String[] args) throws UserInputException, PartyFullException, EnumException, UI2Exception {
    

Scanner sc = new Scanner(System.in);


int userstate =-1;
int partyswitch = -1; 

String username;

String userrole=""; 

Party zero =new Party(); 
Party one = new Party(); 


ArrayList<Character> userdefinedcharacters = new ArrayList<>();


while (userstate!=0)


{

    System.out.println("Type 0 to exit the program \n 1 to create a new character \n 2 to view current Parties");

    try {userstate = sc.nextInt();} finally {

    if (userstate==0) {System.out.println("Exiting... "); sc.close(); System.exit(0);};

    if (userstate==2) {System.out.println("Party Zero: ");  zero.toString(); System.out.println(" Party One: "); one.toString(); };

    if (userstate==1) {

    System.out.println("Type the character name: ");

        username=sc.nextLine();


    System.out.println("Type the character role: DAMAGE, TANK, HEALER: ");

        try {userrole=sc.nextLine();} finally {


Character e = new Character(username, CharacterRole.valueOf(userrole)); 

userdefinedcharacters.add(e); 

System.out.println("Which party would you like to add this character to? 0 - Party Zero or 1 - Party One? ");

    try { partyswitch=sc.nextInt(); } finally {
    
    if (partyswitch==0) zero.add(e); else one.add(e); };

        };


    };
 

    };





}


sc.close();




}




}