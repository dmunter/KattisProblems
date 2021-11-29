import java.util.Scanner;

public class JumbledCompass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int from = sc.nextInt(), to = sc.nextInt();
		if(from == to) {
			System.out.print("0");
		}
		else if(from < to) {
			int dif1 = to - from;
			int dif2 = (360 - to) +from;
			if(dif1 <= dif2) {System.out.print(dif1);
			} else { System.out.print(-dif2);}	
		} else {
			int dif1 = from - to;
			int dif2= (360 -from) + to;
			if(dif1< dif2) {System.out.print(-dif1);
			} else { System.out.print(dif2);}			
		}
}
}