import java.util.Scanner;

public class DivThreeMoreDigits {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in); int sum=0;
                System.out.println("Type a number: "); long n = sc.nextLong(); if (n<0) n*=-1; String str = Long.toString(n); 
                long[] a = new long[str.length()]; 
                for(int i=0; i<str.length(); i++){ a[i] = Character.getNumericValue(str.charAt(i)); };
                for(int i=0; i<str.length(); i++){ sum+=a[i]; };
                if (sum%3==0) {System.out.println("Yes, it is divisible by 3. ");}
                else {System.out.println("No, it is not divisible by 3. ");} sc.close(); } }