import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        int c = 0;
        char letter = ' ';
        int h = 0;
        boolean ch = true;
        //sets up a bunch of variables, counter and placeholder values
        System.out.println("Input individual letters of a word to have checked if its a palindrome. (Input number 0 to end)");
        //informs user of the rules then loops the following as long as a 0 isn't input
        while (letter !='0'){
            letter = ' ';
            //resets the value for the input
            System.out.print("What letter?: ");
            letter = scanner.next().charAt(0);
            //asks for input and below is a removed line used for testinf
            // System.out.println(letter+", "+Character.isLetter(letter));
            if ((letter != '0')&&((Character.isLetter(letter))==true)){
                word = word + letter;
                c++;}
            //if the input is not 0, and is a letter, adds the letter to the word and 1 to the counter
            if ((letter != '0')&&(Character.isLetter(letter))==false){
                System.out.println("Invalid input, input one character at a time");}
                //error handling
            if (letter == '0'){System.out.println("End of word: "+word);}};
                //ends the loop if 0 is input

        scanner.close();
        char arr1[] = word.toCharArray();
        //converts the word to an array of characters
        //conditional branches for odd or even numbers of letters (checked using the counter)
        if (c%2 == 0){
            //loops as long as h is equal to half of c-1 (c-1 is used because the first slot of an array is 0)
            while ((h*2)<(c-1)){
                if((arr1[h]==arr1[(c-h-1)])&&(ch != false)){
                    ch = true;}
                    //if the 'h'th and h to last letters are identical, its a palindrome
                    //repeats for the entire array/word
                else{ch=false;}
                //in case its not a palindrome
                    h++;}}
                    //adds to the position counter, then starts loop over
        
        //nearly identical to the other if branch, but accounts for uneven numbers of letters
        if (c%2==1){
            while(((h*2)+1)<(c-1)){
                if((arr1[h]==arr1[(c-h-1)])&&(ch != false)){
                    ch = true;}
                else{ch=false;}
                    h++;}}
            
        String pal = "";
        if (ch==true){
            pal = "is a palindrome";}
        if(ch==false){
            pal = "is not a palindrome";}
        System.out.println("The word "+word+" "+pal);
        //prints it nicely whether the word is a palindrome
    }
}
