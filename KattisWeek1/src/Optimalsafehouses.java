import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Optimalsafehouses {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		ArrayList <Point> spy = new ArrayList<>();
		ArrayList <Point> house = new ArrayList<>();
	int n = sc.nextInt();sc.nextLine();
	for(int r =0; r<n; r++) {
		String ln = sc.nextLine();
		for(int c=0; c<n; c++) {
			char curr = ln.charAt(c);
			if(curr== 'S') spy.add(new Point(r, c));
			if(curr== 'H') house.add(new Point(r,c ));
		}
	}
	int maxMin = 0; // max of all minumum values
	for(Point s: spy ) {
		int indMin= Integer.MAX_VALUE; //individual minimum
		for(Point h: house) if(s.dist(h)< indMin) indMin = s.dist(h);
			
	}
}
	
	
	

}
