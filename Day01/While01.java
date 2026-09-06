package start;
import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
				
		while (true) {
			
			
			System.out.print("숫자를 입력하세요: ");
			int i = sc.nextInt();
			
			if(i==0) {
				break;
			}
			
			sum += i;
	
		
		}
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");

	}

}
