package abstractclass;

import Day04.Eagle;
import Day04.Goldfish;
import Day04.Horse;
import Day04.Pig;
import Day04.Tiger;

public class TestAbstract {

	public static void main(String[] args) {
		
		
		
		System.out.println(">>> 독수리");
		Eagle e = new Eagle("고기");
		printDayLife(e);
		
		System.out.println(">>> 호랑이");
		Tiger t = new Tiger("고기");
		t.eat();
		t.sleep();
		t.move();
		
		System.out.println(">>> 금붕어");
		Goldfish g = new Goldfish("플랑크톤");
		g.eat();
		g.sleep();
		g.move();
		
		System.out.println(">>>돼지");
		Pig p = new Pig("잡식");
		p.eat();
		p.sleep();
		p.move();
		printDayLife(p);
		
		System.out.println(">>> 말");
		Horse h = new Horse("당근");
		printDayLife(h);
		
		

	}
	static void printDayLife(Day04.Animal a) {
		a.eat();
		a.move();
		a.sleep();
		
	}

}
