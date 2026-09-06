package Start;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 a에 넣을 숫자 입력:");
		int a = sc.nextInt();
		
		System.out.print("변수 b에 넣을 숫자 입력:");
		int b = sc.nextInt();
		
		int change;
		change = a;
		a = b;
		b = change;
		System.out.println("Swapping 결과>\n변수 a의 값 = " + a + "\n" + "변수 b의 값 = " + b);
		
		
		// ** github 참고함
		

	}

}
