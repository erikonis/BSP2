import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbr = scanner.nextInt();
		int base = nbr;

		int check = 0;

		while(nbr > 0){
			check = check + (nbr % 10);
			nbr = nbr/10;
		}
		String out = (check % 3) == 0 ? " is divisible by three":" is not divisible by three";
		System.out.print(base + out);
		scanner.close();
	}
}