package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: put your code here
        //      Hint: you can read whether we want to
        //            use AM mode as a boolean using the
        //            nextBoolean() method of Scanner

        
        System.out.println("Please enter  hours");
        int hh = scanner.nextInt();
        System.out.println("Please enter  minutes");
        int mm = scanner.nextInt();
        System.out.println("Please enter  seconds");
        int ss = scanner.nextInt();
        System.out.println("If needed Please enter 1 for AM 2 for PM or 0 ");
        int time = scanner.nextInt();

        //checking input
        //I already made my code in 1) so that when the number is over 59 it increase the next one that because I use a loop here
        for(int i = 0; i<2;i++)
        {
            if(i == 1)
            {
                ss += 5;
            }
            if(ss >= 60)
            {
                double temp = ss/60.0;
                mm += temp/1;
                ss = (int)Math.round(temp%1*60);
            }
            if(mm >= 60)
            {   
                double temp = mm/60.0;
                hh += temp/1;
                mm = (int)Math.round(temp%1*60);
            }
            if(time == 1 || time == 2)
            {
                if(hh>12)
                {
                    hh = 12;
                }
            }

            if(time == 1)
            {   
                System.out.format("%02d:%02d:%02d AM",hh, mm, ss);
                System.out.println();
            }
            if(time == 2)
            {   
                System.out.format("%02d:%02d:%02d PM",hh, mm, ss);
                System.out.println();
            }
            if(time == 0)
            {   
                if(hh>=24)
                {
                    hh = 0;
                }
                System.out.format("%02d:%02d:%02d",hh, mm, ss);
                System.out.println();
            }
        }
        
        
        
        

        scanner.close();
    }
}
