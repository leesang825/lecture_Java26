package Start;

public class Star04 {

	public static void main(String[] args) {
		int i,j,k;
		
		for (i=1; i<=5; i++) {
			for (j=1; j<i; j++){
				System.out.print(" ");	}
			for (k=5; k>=j; k--) {
				System.out.print("*");
				}
			System.out.println();
			
			
		}
		

	}

}
