import java.util.ArrayList;
import java.util.Scanner;

public class LineThemUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> name = new ArrayList<>();
		int leng = sc.nextInt();
		
		for(int i = 0; i < leng; i++) {
			name.add(sc.next());
		}

		boolean decreases = false;
		boolean increases = false;
		for(int i=0; i< leng-1;){			
			if( decreases == false && name.get(i).compareToIgnoreCase(name.get(i+1)) > 0) {decreases = true; 	  }	
			if( increases == false && name.get(i).compareToIgnoreCase(name.get(i+1)) < 0) {increases = true;	   }	
		i++;
		}
			if(decreases == increases) {System.out.print("NEITHER"); }
			if(decreases == true && increases == false) {System.out.print("DECREASING"); }
			if(decreases == false && increases == true) {System.out.print("INCREASING"); }
	
	}
}
