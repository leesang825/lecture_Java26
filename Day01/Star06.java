package Start;

public class Star06 {

	public static void main(String[] args) {
		int i,j,k;
		// 조건식 github 참조
		
		for (i=1; i<=5; i++) {
			for (j=1; j<=i-1; j++) {
				System.out.print(" ");
				
			}
			for (k=1; k<=11-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
