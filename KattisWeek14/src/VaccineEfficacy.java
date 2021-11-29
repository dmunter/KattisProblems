import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class VaccineEfficacy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int entries = sc.nextInt();
		sc.nextLine();
		int vac[] = new int[4];
		int control[] = new int[4];
		for(int i =0; i < entries; i++) {
			String line = sc.nextLine();
			if(line.charAt(0) == 'Y') {
				for(int p=1; p < 4; p++) {
					if(line.charAt(p) == 'Y') vac[p]++;}
				vac[0]++;
					
			} else {
				for(int p=1; p< 4;p++) {
					if(line.charAt(p) == 'Y')  control[p]++;}
				control[0]++;
		
			}
			
		}
		double nA = (double)control[1]/control[0]; 
		double nB = (double)control[2]/control[0];
		double nC = (double)control[3]/control[0];
		
		double vA = (double)vac[1]/vac[0];
		double vB = (double)vac[2]/vac[0];
		double vC = (double)vac[3]/vac[0];
		
		double result1 = nA-vA;
		double result2 = nB-vB;
		double result3 = nC-vC;
		if(result1/nA > 0) {System.out.println(result1/nA*100);}else{System.out.println("Not Effective");}
		if(result2/nB > 0) {System.out.println(result2/nB*100);}else{System.out.println("Not Effective");}
		if(result3/nC > 0) {System.out.println(result3/nC*100);}else{System.out.println("Not Effective");}
			
	
		
	
	}
 }
	
