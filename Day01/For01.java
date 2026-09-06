package Start;
import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();
		
		int sum, i;
		
		for (sum=0, i=1; number >= i; i++) {
			
			sum += i;
			
}
		System.out.print("1부터 " + number + "까지의 합은" + sum + "입니다");
		
	  }
  }
		


