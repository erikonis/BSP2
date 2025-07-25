import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String output;
		switch(scanner.nextInt()) {
			case 10:
			  output = "Beer with TAs";
			  break;
			case 20:
			  output = "Beer with TAs\n";
			  output += "Your name in ASCII art\n";			  
			  break;
			case 50:
			  output = "Beer with TAs\n";
			  output += "Your name in ASCII art\n";
			  output += "Public display of your donation on Moodle\n";			  
			  break;
			case 100:
			  output = "Beer with TAs\n";
			  output += "Your name in ASCII art\n";
			  output += "Public display of your donation on Moodle\n";
			  output += "Uni.lu USB Stick of 128GB\n";			  
			  break;
			case 200:
			  output = "Beer with TAs\n";
			  output += "Your name in ASCII art\n";
			  output += "Public display of your donation on Moodle\n";
			  output += "Uni.lu USB Stick of 128GB\n";
			  output += "Uni.lu Smartphone cover,Keychain 'I love Programming 1'\n";			  
			  break;
			case 500:
			  output = "Beer with TAs\n";
			  output += "Your name in ASCII art\n";
			  output += "Public display of your donation on Moodle\n";
			  output += "Uni.lu USB Stick of 128GB\n";
			  output += "Uni.lu Smartphone cover,Keychain 'I love Programming 1'\n";
			  output += "Autograph of your professors, Five free lunches at the 'Food house'\n";			  
			  break;
			default:
			  output = "Error";
		  }
		  System.out.println(output);

		scanner.close();
	}
}