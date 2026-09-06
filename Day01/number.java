package start;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		
		try (
			Scanner sc = new Scanner(System.in)){
		
			System.out.print("정수를 입력하세요:" );
			int name = sc.nextInt();
		    
		
			System.out.println(name % 2 == 0 ? "짝수":"홀수");
		}
		
		

	}

}
