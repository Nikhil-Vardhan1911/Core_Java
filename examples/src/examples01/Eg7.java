package examples01;

public class Eg7 {
	
	public static void main(String[] args) {
		Pattern(5);				
		}
	static void Pattern(int n) {
		for(int row=1;row<=2*n;row++) {
			int NumberOfColumns = row>n?2*n-row:row;
			int NumberOfSpaces = n-NumberOfColumns;
			for(int spaces=0;spaces<NumberOfSpaces;spaces++) {
				System.out.print(" ");
			}
			for(int column=1;column<=NumberOfColumns;column++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
	}
 }

