import java.util.LinkedList;
import java.util.Scanner;

public class Cutinline {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		LinkedList <String> list = new LinkedList();
		for(int i=0; i < n; i++) {list.add(sc.next());}
		int N = sc.nextInt();
		
		for(int i=0; i < N; i++) {
			if(sc.next().equals("cut")){
				String str = sc.next();
				list.add(list.indexOf(sc.next()),str);
			} else {list.remove(list.indexOf(sc.next()));}
		}
		for(String s: list)System.out.println(s);
	}
		
}
