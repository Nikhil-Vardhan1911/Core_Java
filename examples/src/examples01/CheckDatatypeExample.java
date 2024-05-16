package examples01;
import java.util.Scanner;
public class CheckDatatypeExample {
	
	public static void main(String args[]) {
		
		int Data;
		char cdata;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String value:");
		str = sc.nextLine();
		
		System.out.println("Enter a Integer value:");
		Data = sc.nextInt();
		
		System.out.println("Enter a character value:");
		cdata = sc.next().charAt(0);
		
		sc.close();
		
		System.out.println(Data+"is type of " +((Object)Data).getClass().getSimpleName());
		System.out.println(cdata+ " is type of "+((Object)cdata).getClass().getSimpleName());
		
		
	}

}
