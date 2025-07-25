import java.util.Scanner;

public class PalindromeCaseInsensitive {

    public static void main(String[] args) {
        
        char[] seq = new char[10001]; boolean even = false; boolean palindrome=true; 

        Scanner sc = new Scanner(System.in);

        int k=0;

        do {
            if (k==10000) {System.out.println("You have entered 10000 char. This program can't take anymore. "); break; }
            System.out.println(" Enter char with index number " + (k+1) + " (0 to stop): ") ;
            seq[k] = sc.nextLine().charAt(0);
            if (seq[k]=='0') { break; };
            k++;
        } while (k<10001);

        // if the user stopped the input of chars with 0, then they had not reached 10000 char, and inside the for loop a char has been added at the end of the array; shall we ignore it?
        if (seq[k]=='0') k-=1;

        // a palindrome has at least 3 letters
        if (k<2) {System.out.println(" Less than 3 char entered, cannot evaluate whether or not it is a palindrome... Exiting... "); sc.close(); System.exit(9);}; 

        //!!!!!!!!! tbe following line converts all the letters in the array to lowercase letters, in order to create a case insensitive palindrome checking program
        for (int i=0; i<=k; i++) seq[i]=Character.toLowerCase(seq[i]);

        //checking if it works
        for (int i=0; i<=k; i++) System.out.println(seq[i]);

        // is there an even number of char in the array?
        if (k%2!=0) even=true;

        if (even) {

            for (int v=0; v<=(k/2); v++) for (int w=k; w>=(k/2)+1; w-- ) {if (seq[v]!=seq[w]) palindrome = false;  };
        
        } else {

            for (int v=0; v<=(k/2)-1; v++) for (int w=k; w>=(k/2)+1; w-- ) {if (seq[v]!=seq[w]) palindrome = false;  };

        };

        if (!palindrome) System.out.println(" Not a palindrome! "); else { System.out.println("Yes, it is a palindrome! A case sensitive one! "); }; 

        sc.close();
}

}