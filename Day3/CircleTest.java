package javaStudy;
import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름: ");
		double radious = sc.nextDouble();
		
		System.out.println("반지름이 "+radious+"인 원의 넓이는 "+Circle.getArea(radious)+"입니다.");
	}

}
