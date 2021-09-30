package kattisWeekSix;
import java.util.Scanner;
public class heliocentric {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			int casenum=1;
			while(sc.hasNext()) {
			int earthOrb= sc.nextInt();
			int marsOrb= sc.nextInt();
			boolean loop= true;
			int totaldays=0;
			//System.out.print(sc.hasNextLine());
			
			while(loop) {
				while(marsOrb%687 == 0 && earthOrb%365==0)
				{System.out.println("Case " + casenum + ": " + totaldays); loop= false; break;}
			earthOrb++;
			marsOrb++;
			totaldays++;
			
			}
			casenum++;
		}		
		}
	
}

