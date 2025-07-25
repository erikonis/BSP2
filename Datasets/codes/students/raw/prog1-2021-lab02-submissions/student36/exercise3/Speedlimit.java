package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
        // Ex3.1 - Put your speedlimit checking code here
        //          Hint: We use a "Scanner" as seen in
        //          Exercise3 of Lab01 "Reading User Input"
        //          to read from standard input
        Scanner scanner = new Scanner(System.in);
        
        // Asking the user to enter the road type id
        System.out.print("Please enter road type id: ");

        // Reading the road type id from standard input
        int roadTypeId = scanner.nextInt();

        //TODO: Extend the code here to read the current speed etc.
        //      Hint: You can reuse the existing Scanner to 
        //            read the speed as well
        //      Hint: Scanner has a method called nextDouble()
        //            to read double valued if you wish to do so
        System.out.println("Please enter drivers traveling speed:");
        double driversSpeed = scanner.nextDouble();
        //checking the inputs
        double excess = 0;
        if(roadTypeId == 1)
        {
            if(driversSpeed>130)
            {
                excess = driversSpeed - 130;
                System.out.println("Too fast for motorway road. " + excess +" over the limit!");
            }
            else
            {   if(driversSpeed<=130)
                {
                System.out.println("Speed OK for motorway road.");
                }   
            }
        }
        
        if(roadTypeId == 2)
        {
            if(driversSpeed>90)
            {
                excess = driversSpeed - 90;
                System.out.println("Too fast for ordinary road. " + excess +" over the limit!");
            }
            else
            {   if(driversSpeed<=90)
                {
                System.out.println("Speed OK for ordinary road.");
                }   
            }
        }

        if(roadTypeId == 3)
        {
            if(driversSpeed>50)
            {
                excess = driversSpeed - 50;
                System.out.println("Too fast for town road. " + excess +" over the limit!");
            }
            else
            {   if(driversSpeed<=50)
                {
                System.out.println("Speed OK for town road.");
                }   
            }
        }

        if(roadTypeId == 4)
        {
            if(driversSpeed>30)
            {
                excess = driversSpeed - 30;
                System.out.println("Too fast for calmed road. " + excess +" over the limit!");
            }
            else
            {   if(driversSpeed<=30)
                {
                System.out.println("Speed OK for calmed road.");
                }   
            }
        }
        // TODO: Ex3.2 - Extend your {code to calculate and print the fine
        if(roadTypeId ==1)
        {
            if(driversSpeed>130)
            {
                double rate = (excess/130)*100;
                if(rate>= 0 && rate<=5)
                {
                    System.out.println("the driver were " + rate +"% to fast the fine to pay is 0€" );
                }
                else
                {
                    if(rate>5 && rate <=30)
                    {

                        System.out.println("the driver were " + rate +"% to fast the fine to pay is 50€");
                    }
                    else 
                    {
                        if(rate>30 && rate <= 50)
                        { 
                            System.out.println("the driver were " + rate +"% to fast the fine to pay is 150€" );
                        }
                        else
                        {
                            if(rate>50)
                            {
                                System.out.println("the driver were " + rate +"% to fast the fine to pay is 500€" );
                            }
                        }
                    }
                }
            }   
        }

        if(roadTypeId ==2)
        {
            if(driversSpeed>90)
            {
                double rate = (excess/90)*100;
                if(rate>= 0 && rate<=5)
                {
                    System.out.println("the driver were " + rate +"% to fast the fine to pay is 0€" );
                }
                else
                {
                    if(rate>5 && rate <=30)
                    {

                        System.out.println("the driver were " + rate +"% to fast the fine to pay is 50€");
                    }
                    else 
                    {
                        if(rate>30 && rate <= 50)
                        { 
                            System.out.println("the driver were " + rate +"% to fast the fine to pay is 150€" );
                        }
                        else
                        {
                            if(rate>50)
                            {
                                System.out.println("the driver were " + rate +"% to fast the fine to pay is 500€" );
                            }
                        }
                    }
                }
            }   
        }

        if(roadTypeId ==3)
        {
            if(driversSpeed>50)
            {
                double rate = (excess/50)*100;
                if(rate>= 0 && rate<=5)
                {
                    System.out.println("the driver were " + rate +"% to fast the fine to pay is 0€" );
                }
                else
                {
                    if(rate>5 && rate <=30)
                    {

                        System.out.println("the driver were " + rate +"% to fast the fine to pay is 50€");
                    }
                    else 
                    {
                        if(rate>30 && rate <= 50)
                        { 
                            System.out.println("the driver were " + rate +"% to fast the fine to pay is 150€" );
                        }
                        else
                        {
                            if(rate>50)
                            {
                                System.out.println("the driver were " + rate +"% to fast the fine to pay is 500€" );
                            }
                        }
                    }
                }
            }   
        }

        if(roadTypeId ==4)
        {
            if(driversSpeed>30)
            {
                double rate = (excess/30)*100;
                if(rate>= 0 && rate<=5)
                {
                    System.out.println("the driver were " + rate +"% to fast the fine to pay is 0€" );
                }
                else
                {
                    if(rate>5 && rate <=30)
                    {

                        System.out.println("the driver were " + rate +"% to fast the fine to pay is 50€");
                    }
                    else 
                    {
                        if(rate>30 && rate <= 50)
                        { 
                            System.out.println("the driver were " + rate +"% to fast the fine to pay is 150€" );
                        }
                        else
                        {
                            if(rate>50)
                            {
                                System.out.println("the driver were " + rate +"% to fast the fine to pay is 500€" );
                            }
                        }
                    }
                }
            }   
        }
        
        // Streams should be closed - More details in a later class
        scanner.close();
    }
}

