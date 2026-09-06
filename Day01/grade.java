package start;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요:");
		int name = sc.nextInt();
		
		if (name >= 90) {
			
			System.out.println("A");
		}
		else if (name >= 80) {
			System.out.println("B");
		
		}
		else if (name >= 70) {
			System.out.println("C");
		
		}
		else if (name >= 60) {
			System.out.println("D");
		
		}
		else {
			System.out.println("F");
		}
	
	}
		

}
