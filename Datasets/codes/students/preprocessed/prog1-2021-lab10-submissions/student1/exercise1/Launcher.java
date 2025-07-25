import java.util.Scanner;

public class Launcher{
    
    public static void main(String[] args) {
 
        Party party0 = new Party();
        Party party1 = new Party();
        
        Scanner scan = new Scanner(System.in);
        int command = 0;


        //runs forever
        while(true){
            System.out.println("Commands: \n0 - Exit\n1 - Create new Character\n2 - Show Party ");
            System.out.print("Command: ");

            //If it is not a command id (switch), will print "wrong value"
            try{
                command = Integer.parseInt(scan.next());
            }catch(Exception e){
                System.out.println("Wrong value type for this field.");
                continue;
            }

            switch(command){
                //ends loop
                case 0:
                    System.out.println("Exit!");
                 System.exit(0);
                    break;
                //asks for new a Character
                case 1:{
                    Character character = new Character();
                    //asks for the anme and if the name has more than 20 characters, it will catch the exception
                    System.out.print("Enter name: ");
                    try{
                        character.setName(scan.next());
                    }catch(LongNameException e){
                        System.out.println(e);
                         continue;
                    }
                    
                    //asks fot the role
                    System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                    character.setRole(CharacterRole.valueOf(scan.next()));

                    System.out.print("Add to party (0 or 1): ");
                    command = scan.nextInt();

                    if(command == 0){
                        //adds character to party0 and checks how many roles have been added
                        try{
                            party0.add(character);
                            System.out.println("Added " + character + " to Party 0");

                        }catch(FullRoleException e){
                            System.out.println(e);
                        }
                        
                    }else if(command == 1){
                        //adds character to party1 and checks how many roles have been added
                        try{
                            party1.add(character);
                            System.out.println("Added " + character + " to Party 1");

                        }catch(FullRoleException e){
                            System.out.println(e);
                        }       
                    }
                        
                    

                }break; // end CASE 1

                case 2:{ 
                    //outputs party1 or party2
                    System.out.println("Show party (0 or 1): ");
                    command = scan.nextInt();
                    if (command == 0){
                        System.out.println(party0);

                    }else if(command == 1){
                        System.out.println(party1);
                    }

                }break; //end case 2


                default:
                    System.out.println("Wrong value type for this field.");
                break;


            }//End Switch

           
        }//End While


        

      
    }
  
}

