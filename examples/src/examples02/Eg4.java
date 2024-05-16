package examples02;

public class Eg4 {
	
	public static void main(String[] args) {
		int number = 8769;
		int reverse = 0;
		
		for(;number!=0;number=number/10) {
			int remainder = number%10;
			reverse = reverse*10+remainder;
		}
		System.out.println(reverse);
	}
}
