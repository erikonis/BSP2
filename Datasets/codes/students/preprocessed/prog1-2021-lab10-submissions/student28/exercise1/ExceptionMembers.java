import java.util.Scanner;

import javax.naming.InvalidNameException;

public class ExceptionMembers {
    
    public void addmember()throws not1or0{
        Scanner scanner = new Scanner(System.in);
        int readNumber;
        int counter = 0;
        int i =0;
        Character[] group = new Character[1000];

    do {
        System.out.println("Enter 1 to create a new Character or 0 to exit the program.");
        readNumber = scanner.nextInt();

            if(readNumber == 1){
                String name_ = null;
                CharacterRole role_ = null;

                try{
                    System.out.println("Enter the name of the Character (NO NULL and NO MORE THAN 20 CHARACTERS allowed)");
                    name_ = scanner.next();
                    if(name_.chars().count()>21){
                        throw new toolongException();
                    }
                    if(name_ =="" ){
                        throw new nullString();
                    }
                    System.out.println("Enter the  role of the Character (DAMAGE, HEALER or TANK) ");
                    String roleString = scanner.next();
                               
                    switch (roleString){
                        case "DAMAGE", "damage":
                            role_ = CharacterRole.DAMAGE;
                            break;
                        case "HEALER", "healer":
                            role_ = CharacterRole.DAMAGE;
                            break;
                        case "TANK", "tank":
                            role_ = CharacterRole.TANK; 
                            break;
                        default:
                            throw new UnknowRole();
                    }
                } catch (nullString e){
                System.err.println("NULL names are not allowed");
                } catch (toolongException e){
                System.err.println("NO more than 20 characters allowed");  
                } catch (UnknowRole e){
                System.err.println("ROLE not found");
                }
                finally{
                    if(name_!=null && role_ != null){
                    group[i] = new Character(name_, role_);
                    i++;
                    counter++;
                    }
                
                }
            }
        } while (readNumber != 0);



        for (int j = 0; j< counter; j++){
            System.out.println(group[j].toString());
        }
}


    
}
