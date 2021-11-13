import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Trik {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = {1,0,0};
		String line = br.readLine();	
			for(int i = 0; i<line.length(); i++) {
				char character = line.charAt(i);				
				if(character == 'A') {int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;}
				if(character == 'B') {int temp = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;}
				if(character == 'C') {int temp = arr[0];
				arr[0] = arr[2];
				arr[2] = temp;}
			}
		int i=0;	
		for(int s: arr) {
			i +=1;
			if(s==1) {
			System.out.print(i);
			}		
		}		
	}

}
