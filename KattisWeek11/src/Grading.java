import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
		int FG = sc.nextInt();
		
		if(FG > 100)System.exit(1);
		if(FG < e) System.out.print('F');
		if(FG>=e) {
			if(FG>=d) {
				if(FG>=c) {
					if(FG>=b) {
						if(FG>=a) {							
							System.out.print('A');
							return;
						}					
						System.out.print('B');
						return;
					}
					System.out.print('C');
					return;
				}
				System.out.print('D');
				return;
			}
			System.out.print('E');
			return;
		}
	
	}
}
