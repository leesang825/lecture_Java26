package start;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		while(true) {
			
			System.out.print("숫자를 입력하세요:");
			int i = sc.nextInt();
			if(i % 2 == 0) {
				System.out.println("짝수입니다.");
				
			}
			else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속 하시겠습니까? (0-멈춤/1-계속)");
			int choice = sc.nextInt();
			
			if (choice == 0) {
				
				break;
			}
			
			
			
		}
		

	}

}
