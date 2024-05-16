package examples01;
public class Eg6 {	
	public static void main(String[] args) {
		Eg6 eg6 = new Eg6();
		eg6.Pattern(5);
	}
	public void Pattern(int n) {
		for(int row=1;row<=2*n;row++) {
			int numOfColumns = row>n?2*n-row:row;
			for(int column=1;column<=numOfColumns;column++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
