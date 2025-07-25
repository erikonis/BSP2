import java.util.Scanner;

class PalidromeCaselnsensitive {
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******************************************************************");
		//ask the user to enter a word
		//define some string variables
		System.out.println("Please enter a word");
		String word= scanner.nextLine();
		String rsv="";
        //rsv = word.replaceAll("[^a-zA-Z]+", "").toLowerCase();
		//with loLowerCase(); every character will be written in lower case
		rsv = word.toLowerCase();	
		//for-loop for each digit/character			
		for(int s=word.length()-1;s>=0;s--)
		{
			//give us a charcter for a index back
			rsv=rsv+word.charAt(s);
		}
		//if clause for equals()
		if(word.equals(rsv))
		{
			//output if the string is a palidrome
			System.out.println( word + " is a palidrome");
		}
		else
		{
			//output when the string isn't a palidrome
			System.out.println(word + " is not a palidrome");
		}	
		//output	
		System.out.println("******************************************************************");
		//close the scanner
		scanner.close();

	}
}

