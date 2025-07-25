import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a sequence of chars. Enter 0 if you wish to stop.");

            char sequence = 1;
            String line = "";

            while (sequence != '0')
                {
                    sequence = scanner.next().charAt(0);
                    
                    if (sequence == '0'){}
                    else {line = line + sequence;}

                }
            
            int length = line.length();
            int last = length;
            int first = 0;
            int countdown = length / 2;

            char check1 = '0';
            char check2 = '0';

            while (countdown > 0)
                {
                    check1 = line.charAt(first++);
                    check2 = line.charAt(--last);
                    --countdown;
                    if (check1 != check2)
                        {
                            System.out.println(line + " is not a palindrome.");
                            System.exit(0);
                        }
                }



        System.out.println(line + " is a palindrome.");

    scanner.close();
    }
    
}
