import java.util.ArrayList;
import java.util.Scanner;



public class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //creating an aray list to add characters in it.
        ArrayList<Character> list = new ArrayList<Character>();

        System.out.println("enter the sequence of chars : (enter 0 to finish)");
        //adding the characters.
     while (true){
          char L = s.next().charAt(0);


            if (L == '0'){
                break;
                
           }

           list.add(L);
          }


          s.close();

            String word = "";
            String inversWord = "" ;

         //creating an array with the size of a list created before.
          Character [] chars = new Character[list.size()];

          //adding the list to the array.
          chars = list.toArray(chars);


              
          for(int i = 0 ; i< chars.length; ++i){

              word = ""  +  chars[i];
               System.out.print( word  );
       
         }
              System.out.printf("%n", word);



       for (int j = chars.length - 1; j >= 0; j--) {

             inversWord = "" + chars[j];
             System.out.print(inversWord );
       
          }
          System.out.printf("%n" , inversWord);


          if ( word.equals(inversWord) ){
        System.out.println("the sequence is a palindrome.");
        
         }else
            
           System.out.println("the sequence is not a palindrome.");
          }
        


    }

          
         
         

        
          
          
          
            

            

          
           

         



        
       
      
    
    




    
    

