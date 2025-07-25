import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        //NOTE: this program is nearly identical to the case sensitive variant.
        //the only difference is at line 31 of the code + commentary
        Scanner scanner = new Scanner(System.in);
        String word = "";
        int c = 0;
        char letter = ' ';
        int h = 0;
        boolean ch = true;
        String pal = "";
        System.out.println("Input individual letters of a word to have checked if its a palindrome. (Input number 0 to end)");
        while (letter !='0'){
            letter = ' ';
            System.out.print("What letter?: ");
            letter = scanner.next().charAt(0);
            // System.out.println(letter+", "+Character.isLetter(letter));
            if ((letter != '0')&&((Character.isLetter(letter))==true)){
                word = word + letter;
                c++;}
            if ((letter != '0')&&(Character.isLetter(letter))==false){
                System.out.println("Invalid input, input one character at a time");}
            if (letter == '0'){System.out.println("End of word: "+word);}};

        scanner.close();
        //added the line below to make the case irrelevant
        //done by taking the string for the char array into all uppercase
        //and then afterwards converting it to the array without modifying the original word
        char arr1[] = (word.toUpperCase()).toCharArray();
        //case doesn't matter if everything is set to the same case
        if((c%2 == 0)&&(c!=0)){
            while ((h*2)<(c-1)){
                if((arr1[h]==arr1[(c-h-1)])&&(ch != false)){
                    ch = true;}
                else{ch=false;}
                    h++;}}
        if (c%2==1){
            while(((h*2)+1)<(c-1)){
                if((arr1[h]==arr1[(c-h-1)])&&(ch != false)){
                    ch = true;}
                else{ch=false;}
                    h++;}}
        if (c==0){
            pal = " is literally nothing";}
        else{
        if (ch==true){
            pal = " is a palindrome";}
        if(ch==false){
            pal = " is not a palindrome";}}
        System.out.println("The word "+word+""+pal);
    }
}
