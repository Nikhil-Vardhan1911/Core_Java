package examples02;

public class Eg3 {
	
	public static void main(String[] args) {
		
		int number = 345678;
		int reverse = 0;
		
		while(number!=0){
			int remainder = number%10;
			reverse = reverse*10+remainder;
			number = number/10;			
		}		
		System.out.println("reverse number of 345678 is:"+  reverse);
	}
}
