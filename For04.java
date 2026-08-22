package Start;
import java.util.Scanner;
public class For04 {

	public static void main(String[] args) {
		
		int f;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int a = sc.nextInt();
		int input = a; // ai 참조
		for(f = 1; a >= 1; a--) {
			
			f = f * a;
			
		}
		
		System.out.println(input+"!"+"="+ f);
		
		
		

	}

}
