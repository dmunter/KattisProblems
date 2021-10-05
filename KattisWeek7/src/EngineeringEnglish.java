import java.util.ArrayList;
import java.util.Scanner;


public class EngineeringEnglish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		ArrayList <String> list = new ArrayList<>();
		boolean isin;
		while(sc.hasNext()){
			list.add(sc.next());
		
		System.out.print(list);
	}
		isin = list.add("that");
		System.out.print(isin);
}
}