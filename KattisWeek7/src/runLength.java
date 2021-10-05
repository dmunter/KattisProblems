import java.util.Scanner;

public class runLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		char x = sc.next().charAt(0);
		String word = sc.nextLine();
	
		if(x=='E') {
			for(int i = 1; i <= word.length()-1; i++) {
				int tempindex = i+1;
				int count = 1;
				while(i <word.length()-1 && word.charAt(i) == word.charAt(tempindex)) {
					count++;
					tempindex++;
					i++;
				}
				System.out.print(word.charAt(i)  );				
				System.out.print(count );		
			}			
		}else{	
			int i=2;
			while(i < word.length()+1) {
				int k = Integer.parseInt(String.valueOf(word.charAt(i)));			
				while(0<k) {
				System.out.print(word.charAt(i-1));
				k--;
				}
			i=i+2;			 
			}
		}
	}

}
