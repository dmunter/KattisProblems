
import java.util.HashMap;
import java.util.Scanner;
	public class CompetitiveArcade {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int n = sc.nextInt(), p = sc.nextInt(), m= sc.nextInt();
			for(int i =0; i < n;i++) {
				map.put(sc.next(), 0);
			}
			int x= 0;
			for(int i =0; i < m;i++) {
				String nextname = sc.next();
				int totalscore = map.get(nextname)+sc.nextInt();
				map.put(nextname, totalscore);
				if(totalscore >= p) {System.out.println(nextname + " wins!"); map.put(nextname, -100000);x++;} 		
			}
			if(x==0) {System.out.print("No winner!");}
		}
	}


