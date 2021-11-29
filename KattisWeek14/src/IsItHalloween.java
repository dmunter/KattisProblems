import java.util.Scanner;

public class IsItHalloween {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.contentEquals("OCT 31") || s.contentEquals("DEC 25")) System.out.print("yup");
		else {System.out.print("nope");}
	}
}
