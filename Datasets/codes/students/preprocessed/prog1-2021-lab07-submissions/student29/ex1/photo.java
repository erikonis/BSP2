import java.util.Scanner;

public abstract class photo {
    public void photos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you want a high quality photo ?");
        String ans=scanner.nextLine();
        if (ans=="yes"){
            robot.battery-=60;
            System.out.println("a high quality photo was taken");
        }
        else{
            robot.battery-=40;
            System.out.println("a low quality photo was taken");
        }
        scanner.close();
        }

        
}

//high quality
//low quality