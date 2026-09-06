package start;
import java.util.Scanner;

public class quardrangle {
	public static void main(String[] args) {
		float a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이:");
		a = sc.nextFloat();
		
		
		System.out.print("직사각형의 세로 길이:");
		b = sc.nextFloat();
		
		System.out.println("직사각형의 넓이는"+(a*b)+"cm입니다");
	}

}
