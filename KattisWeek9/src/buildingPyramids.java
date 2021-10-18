import java.util.Scanner;

public class buildingPyramids {
	
	 public static void main(String[] args) {
		 //Goal: find how many layers of a pyramid we can build with square blocks. 
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextInt();
		double total=0;
		if(x <=0) {System.out.print(0);System.exit(1);}
		int i =1;
		boolean bool = true;
		//check for runtime 
		//long start = System.currentTimeMillis();
		while(bool) {
			//math library inefficient when simple multiplication can be used
			//total = total + Math.pow(((2*i)-1),2);
			if(x<10) {System.out.print(1); bool=false;}
			total = total + ((i*2)-1)*((i*2)-1);		
			
			if( total > x ) {System.out.println(i-1); bool=false; }								
			i++;
		}
			    
		  //long end = System.currentTimeMillis();
		  //System.out.println((end - start) + " ms");
		  
	 }
}
