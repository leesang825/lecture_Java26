package Start;
import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int sum;
		
		for (i = 1,sum = 0; i <= 5; i++) {
			
			System.out.print("5개의 숫자를 입력하세요:");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("5개 숫자의 합은 "+sum+ "입니다");

	}

}
