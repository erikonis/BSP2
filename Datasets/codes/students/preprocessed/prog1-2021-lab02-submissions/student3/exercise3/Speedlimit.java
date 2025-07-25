import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();
        System.out.print("Please enter speed");
		int excess=0;
        int speed = scanner.nextInt();
		float excessprsanteg=0;
		if(roadTypeId ==1){ 
			if(speed>130){
				excess= speed - 130;
				System.out.print("To fast for motorway " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for motorway");
			}
			 excessprsanteg= excess *100/130;
		}
		if(roadTypeId ==2){ 
			if(speed>90){
				excess= speed - 90;
				System.out.print("To fast for ordinary " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for ordinary ");
			}
			excessprsanteg= excess *100/90;
		}
		if(roadTypeId ==3){ 
			if(speed>50){
			    excess= speed - 50;
				System.out.print("To fast for town " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for town");
			}
			excessprsanteg= excess *100/50;
		}
		if(roadTypeId ==4){ 
			if(speed>30){
				excess= speed - 30;
				System.out.print("To fast for calmed " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for calmed");
			}
			excessprsanteg= excess *100/30;
		}System.out.print(excessprsanteg);
        if (excessprsanteg>0){
			if(excessprsanteg<5){
				System.out.print("fine is 0");	
			}else if(excessprsanteg<30){
				System.out.print("the fine is 50");
			}else if(excessprsanteg<50){
				System.out.print("the fine is 150");
			}else {
				System.out.print("the fine is 500");
			}
		}



		
		scanner.close();
	}
}