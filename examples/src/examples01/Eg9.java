package examples01;

public class Eg9 {
	
	public static void main(String[] args) {
		int n=3;
		for(int row=0;row<n;row++) {
			for(int column =1;column<=2*row+1;column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=5;row>1;row--) {
			for(int column=row-2;column>=1;column--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
