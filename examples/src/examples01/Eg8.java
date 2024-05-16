package examples01;

public class Eg8 {
	
	public static void main(String[] args) {
		Eg8 eg8 = new Eg8();
		eg8.Pattern(5);
	}
	public static void Pattern(int n) {
		
		for(int row=1;row<=n;row++) {
			int NumberOfColumns = row;
			int NumberOfSpaces = n-NumberOfColumns;
			for(int space=0;space<NumberOfSpaces;space++) {
				System.out.print(" ");
			}
			for(int column=0;column<NumberOfColumns;column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
