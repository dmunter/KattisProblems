import java.util.ArrayList;
import java.util.Scanner;

public class OptimalSMIL {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			
			ArrayList <Integer> set = new ArrayList<>();
			String[] face = {":)",":-)",";)",";-)"};	

			for(String f: face) {
				int idx= 0;
					while(idx<input.length()) {
						idx = input.indexOf(f, idx )+1;						
						if(idx==0)break;
						set.add(idx-1);	
						
					}
					//System.out.println(' ');
			}
			for(int i: set) System.out.print(i);
		
		}

}
