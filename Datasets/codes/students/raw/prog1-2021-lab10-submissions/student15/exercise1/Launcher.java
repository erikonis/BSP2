package lu.uni.programming1.lab10.exercise1;


import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
            
        int useranswer ;
        int useranswer2 ;
        
           

            Party party1 = new Party();
            Party party2 = new Party();
            
            

            while(true){

                useranswer = 0;


                System.out.println("\nCommands: \n\n" + "0 - Exit\n\n" + "1 - Create new Character\n\n" + "2 - Show Party");
                System.out.println("\nWhat is your choice?");

                try{
                useranswer = scanner.nextInt();

    
               if(useranswer > 2 || useranswer < 0 ){
                   throw new InvalidNumberExeption();
               }
               
                else if(useranswer==0){
                    break;

                }else if(useranswer==1){


                    System.out.println("\nCommand: "+useranswer+"\n\nCreating new Character...");
                    
                    System.out.println("\nAdd to party (0 or 1): "); 
                    
                    try{
                    useranswer2=scanner.nextInt(); 
                    
                    if(useranswer2 > 1 || useranswer2 < 0 ){
                        throw new InvalidNumberExeption();
                    }
                    
                    
                    if(useranswer2==0){

                        try{
                        
                        System.out.println("What should your characters name be?");

                       String name1 = party1.Charactername();
                        
                        System.out.println("What should your characters role be? Write: HEALER / TANK / DAMAGE ");

                            try{

                       String rolename = party1.getRolename();
                       
                
                        CharacterRole role = CharacterRole.valueOf(rolename);

                        Character newCharacter = new Character(name1, role);

                        party1.add(newCharacter);

                    
                
                            }catch(Exception e){

                                System.out.println("Non valid Input! You have to write HEALER, DAMAGE or TANK!");
                           
                    

                        }

                        if( name1.length() >20){
                            throw new ToManyLetters();

                        }else if (name1.length() == 0){
                            throw new ToFewLetters();
                        }
                        }catch(ToManyLetters e){

                        System.out.println("Your characters name has to many letters. Try again!");

                        }catch(ToFewLetters e){

                            System.out.println("You have to enter a name. Try again");

                        }
                     
                    }else if(useranswer2 == 1){
                       try{
                        
                            System.out.println("What should your characters name be?");

                           String name1 = party2.Charactername();
                    
                            System.out.println("What should your characters role be? Write: HEALER / TANK / DAMAGE ");

                            try{

                            String rolename = party2.getRolename();                
                    
                            CharacterRole role = CharacterRole.valueOf(rolename);
    
                            Character newCharacter = new Character(name1, role);

                           

    
                            party2.add(newCharacter);

                            
                           
                        }
                        
                       catch(Exception e){

                          System.out.println("Non valid Input! You have to write HEALER, DAMAGE or TANK!");

                         }
                    
        
    
                            if( name1.length() >20){
                                throw new ToManyLetters();
    
                            }else if (name1.length() == 0){
                                throw new ToFewLetters();
                            }
                            }catch(ToManyLetters e){
    
                            System.out.println("Your characters name has to many letters. Try again!");
    
                            }catch(ToFewLetters e){
    
                                System.out.println("You have to enter a name. Try again");
    
                            }
                    }
                    
                }catch(InvalidNumberExeption e){
                    System.out.println("\nYou have to input either 0 or 1!");

                }
                    

                }else if(useranswer == 2){

                    System.out.println("\nCommand: 2"+"\n\nShow Party (0 or 1): ");
                    
                   try{ 
                    useranswer2 = scanner.nextInt();

                    if(useranswer2 > 1 || useranswer2 < 0 ){
                        throw new InvalidNumberExeption();
                    }

                    if(useranswer2 == 0){

                        System.out.println();
                        System.out.println(party1);;

                    }else if(useranswer2 == 1){
                        System.out.println();
                        System.out.println(party2);;
                    }
                }catch(InvalidNumberExeption e){

                    System.out.println("\nYou have to input either 0 or 1!");

                }
            }



            }catch(InvalidNumberExeption e){
                System.out.println(e.getMessage());         
            
            }catch (Exception e){

                System.out.println("Wrong Input Type! Try again");

            break;
            }

        
        }
        
        scanner.close();
        }
    
    }
   






