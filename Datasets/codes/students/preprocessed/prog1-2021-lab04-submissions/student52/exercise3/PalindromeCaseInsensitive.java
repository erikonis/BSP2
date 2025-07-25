import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        char[] s = new char[100];
        int n = 0;
        boolean pal = true;
        Scanner scanner = new Scanner(System.in);
        s[n] = scanner.next().charAt(0);
        while (s[n] != '0')
            s[++n] = scanner.next().charAt(0);
        for (int i = 0; i < n / 2; i++)
            if (Character.toUpperCase(s[i]) != Character.toUpperCase(s[n - i - 1])) {
                pal = false;
                break;
            }
        System.out.println(pal ? "Our word is a palindrome" : "Our word is NOT a palindrome");

        scanner.close();
    }

}
