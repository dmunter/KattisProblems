import java.util.Scanner;

public class SMIL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		char arr[] =  new char[input.length()];	
		//converts Input(string) into an array of characters
		for(int i =0; i < input.length();i++ ) {
			arr[i] = input.charAt(i);		
		}
		//arrFinal index increamentor
		int index=0;
		//I had to create 2 variables (index and it) to hold my index values. 
		// index - holds the outprint index of : or ;   
		//  it - keeps track of what index my inputed characters 
		for(int it = 0; it < arr.length; it++) {	
			//this function allows to break from nested loops
			outerloop:	
			if(arr.length > it && arr[it] == ':') { 
				index = it;
				//Needed 2 conditions in my if statement. because [arr +1] sometimes didnt exist and it returned an error
				if(arr.length > it+1 && arr[it +1] == '-' ) {
					it++;
					if (arr.length > it +1 && arr[it + 1 ] == ')'){
						System.out.println(index);
						it++;			
					}
				break outerloop;	
				}
				if(arr.length > it+1 && arr[it + 1 ] == ')' ){
					System.out.println(it);
					index++;
					it++;
				}
			}
			//--------------------------------------------------------------
			//Same as code above. Except this route begins with an ;//
			outerloop2:				
			if(arr.length > it && arr[it] == ';') { 
				index = it;
				if(arr.length > it+1 && arr[it +1] == '-' ) {
					it++;
					if (arr.length > it +1 && arr[it + 1 ] == ')'){
						//arrFinal[index] = index;
						//index=-1;
						System.out.println(index);
						it++;			
					}
				break outerloop2;	
				}
				if(arr.length > it+1 && arr[it + 1 ] == ')' ){
					System.out.println(it);
					index++;
					it++;
				}
			}		
		}			
	}
	
}
