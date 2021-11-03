import java.util.Scanner;
public class Lamps {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int hoursDaily = sc.nextInt();
		int powerPrice = sc.nextInt();
		int totalIncandescent = 5, totalLed = 60;
		int days = 0;
		int hourcounter =0;
		int hourcounterBulb =0;
		int  numberOfbulbsPrice =  5, numberOfStripsPrice = 60 ;

		while (totalIncandescent < totalLed) {
			days++;
			hourcounter++;
			hourcounterBulb++;
			if(hoursDaily*hourcounter > 8000) {hourcounter = hourcounter-8000; numberOfStripsPrice = numberOfStripsPrice + 60 ;}
			if(hoursDaily * hourcounterBulb  > 1000) {hourcounterBulb = hourcounterBulb-1000; numberOfbulbsPrice = numberOfbulbsPrice+ 5; }	
					
			totalIncandescent =  (numberOfbulbsPrice + (60 * days  * hoursDaily * powerPrice) /100000); 
			totalLed =  (numberOfStripsPrice +(11*days*hoursDaily*powerPrice)/100000);

			
			
		}

		System.out.print(days);

	
	}
}
