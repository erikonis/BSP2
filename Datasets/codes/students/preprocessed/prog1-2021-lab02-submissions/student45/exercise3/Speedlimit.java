import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		/* String[] roadspeedlimit = { "motorway-130", "ordinary-90", "town-50", "calmed", "30" };
    	String[] typeid = { "1", "2", "3", "4" }; */


		Scanner console = new Scanner(System.in);

		System.out.println("Please enter the road type: ");
 		int iroadtype = console.nextInt();
		System.out.println("Please enter the speed: ");
        int ispeed  = console.nextInt();

	String oresult = "N";
	String inok = "N"; 
	String iunknown = "N"  ;
        int iexcess = 0 ;
	double ipercent = 0 ;
	switch (iroadtype)
        {
        case 1:
        if (ispeed > 130)
		inok = "Y";
		iexcess = ispeed - 130 ;
	break;
        case 2:
	if (ispeed > 90)
                inok = "Y";
		iexcess = ispeed - 90 ;
        break;
        case 3:
	if (ispeed > 50)
                inok = "Y";
		iexcess = ispeed - 50 ;
        break;
	case 4:
	if (ispeed > 30)
                inok = "Y";
		iexcess = ispeed - 30 ;
        break;
        default:
                iunknown = "Y";
	break;
	}
	if (iunknown == "Y")
	oresult = "Unknown road type: "+iroadtype ;
	else if (inok == "Y")
		oresult = "Too fast for road " + iroadtype + ". " + iexcess + " over the limit! ";
	else
		oresult = "Speed OK for road " + iroadtype + ".";

        System.out.println(oresult);

	ipercent = (iexcess / ispeed) * 100;
	int ofine = 0;
	if (inok == "Y")  { 
       		if(ipercent <= 50)
        	    	ofine = 500;
        	else if(ipercent > 30 && ipercent <= 50) 
			ofine = 150 ;
        	else if(ipercent > 5 && ipercent <= 30) 
			ofine = 50 ;
        	else if(ipercent > 0 && ipercent <= 5) 
			ofine = 0 ;

		System.out.println("Fine for speed over the limit: EUR" + ofine);
 		} 
		 console.close(); 
		}
	}
