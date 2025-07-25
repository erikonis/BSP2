import java.util.Scanner;

class Palidrome {
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******************************************************************");
		//ask the user to enter a word
		//to check if the word is a palidrome
		System.out.println("Please enter a word");
		String word= scanner.nextLine();
		String rsv="";
		//for-loop for each digit
		for(int s=word.length()-1;s>=0;s--)
		{
			//give us a charcter for a index back
			rsv=rsv+word.charAt(s);
		}
		//.equals vergleicht strings
		if(word.equals(rsv))
		{
			//output, wenn es ein palidrome ist
			System.out.println("String is a palidrome");
		}
		else
		{
			//output, wenn es kein palidrome ist
			System.out.println("String is not a palidrome");
		}
		//scanner close		
		System.out.println("******************************************************************");
		scanner.close();

	}
}

