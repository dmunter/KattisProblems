import java.util.HashMap;
import java.util.Scanner;

public class Election {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		HashMap<String, String> names = new HashMap<String, String>();
		HashMap<String, Integer> votes = new HashMap<String, Integer>();
		String space = sc.nextLine();
		for(int i = 0; i < n; i++) {
		String canidates = sc.nextLine();
		String party = sc.nextLine();
			names.put(canidates, party);
			votes.put(canidates, 0); 
		}
		int numvotes = sc.nextInt();
		String sta = sc.nextLine();
		for(int i = 0; i < numvotes; i++) {
			int maxvotes = 0;
			String canidate = sc.nextLine();
			if(!names.containsKey(canidate)) { }else {
			votes.put(canidate, votes.get(canidate)+1);			
			int curvote = votes.get(canidate);				
			if(curvote > maxvotes) {maxvotes = curvote;}			
		}}
		String winner = null;
		int maxvote = 0;
		boolean istie = false;
		for(String s: votes.keySet()) {
			int totalvote = votes.get(s); 
			if(totalvote == maxvote) {istie =true;
			}else if(totalvote > maxvote ) {winner = s; maxvote = totalvote; istie = false;}}
				
		if(istie ==true) {System.out.print("tie");}
		else {System.out.print(names.get(winner));}
	}	
}
