package start;
import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요(cm):" );
		double name = sc.nextDouble();
		
		System.out.println(name*name*PI);
		
		
		

	}

}
