package examples02;
import java.util.Scanner;
public class Eg5 {
	
	public static void reversedNumber(int number) {
		if(number<10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.print(number%10);
			reversedNumber(number/10);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the Number to be reversed:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Reveresed Number:");
		reversedNumber(num);		
	}
}
