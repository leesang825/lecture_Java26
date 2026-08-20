package start;
import java.util.Scanner;
public class price {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액:");
		int name = sc.nextInt();
		
		
		
		System.out.println("500원 짜리 =" + (name / 500) + "개");
		System.out.println("100원 짜리 =" + ((name % 500) / 100) + "개");
		
		
	}

}
