import java.util.Scanner;


public class reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int revArr[] = new int[x];
		 int leng = revArr.length;
		 for(int i =0; i < revArr.length; i++) {		
			 revArr [i] = sc.nextInt();	
		 }
		 for(int y =leng -1; y >=0 ;y--) {
				 System.out.println(revArr[y]);
		 }
	}
	 	
}
