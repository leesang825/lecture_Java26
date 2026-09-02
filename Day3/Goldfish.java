package Day04;

public class Goldfish extends Animal {
	
	

	
	
	public Goldfish(String meal) {
		super(meal);
	}

	@Override
	public void eat() {
		System.out.println("플랑크톤");
		super.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}

	public void move() {
		System.out.println("헤엄친다.");
	}

}
