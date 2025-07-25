import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter road type id: ");

        int roadTypeId = scanner.nextInt();

        System.out.println("Please enter drivers traveling speed:");
        double driversSpeed = scanner.nextDouble();
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
        
        scanner.close();
    }
}

