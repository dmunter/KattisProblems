import java.util.Scanner;

public class safehouses {
    public static void main(String args[]){
    	System.out.println("Enter rows in table: ");
        Scanner input = new Scanner(System.in); 
        
        int x = input.nextInt();
    	
    	System.out.println("Enter col in table: ");
        
    	int y = input.nextInt();
    	
    	int array[][]= new int[x][y];
        

        System.out.println("Enter array: ");
        x--;
        y--;
        for(int row=0; row<x ;row++){
        for(int col = 0; col<y ; col++) {
        	
        	array[x][y]=input.nextInt();
        	
        }
        }
        
        System.out.println("Array is : ");

        for(int row=0; row<x ;row++){
            for(int col = 0; col<y ; col++) {
            	
            	System.out.println(array[row][col] + "\t");
            	
            }
        	System.out.println();
            
          } 
    }
}


