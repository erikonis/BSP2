import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id (numbers from 1-4): ");

		int roadTypeId = scanner.nextInt();

		System.out.print("Please enter the speed in km/h: ");
		double speedinput = scanner.nextDouble();
		Double limit = 0.0;
		String roadtype = "none";
		Double over = 0.0;
		int cost = 0;
		if (roadTypeId == 1){
			roadtype = "motorway";
			limit = 130.0;}
		if (roadTypeId == 2){
			roadtype = "ordinary";
			limit = 90.0;}
		if (roadTypeId == 3){
			roadtype = "town";
			limit = 50.0;}
		if (roadTypeId == 4){
			roadtype = "calmed";
			limit = 30.0;}

		if ((limit < speedinput) && (roadTypeId > 0) && (roadTypeId < 4)){
		over = speedinput - limit;
		System.out.println("Too fast for "+roadtype+" road.");
		System.out.println(over+" km/h over the limit");}
		if ((limit >= speedinput) && (roadTypeId > 0) && (roadTypeId < 4)){
		over = speedinput - limit;
		System.out.println("Speed OK for " +roadtype+ " road.");}
		if ((roadTypeId <= 0) || (roadTypeId > 4)){
			System.out.println("Unknown road type: "+roadTypeId);}

		if (over > 0.0){
			double excessvalue = (over / limit)*100;
			if ((excessvalue > 0.0) && (excessvalue <= 5.0)){
				cost = 0;}
			if ((excessvalue > 5.0) && (excessvalue <= 30.0)){
				cost = 50;}
			if ((excessvalue > 30.0) && (excessvalue <= 50.0)){
				cost = 150;}
			if (excessvalue > 50.0){
				cost = 500;}
			System.out.println("You were "+excessvalue+"% over the speed limit");
			System.out.println("You are fined "+cost+"€ for it");}
		
		scanner.close();
	}
}