package Day04;

public class Pig extends Animal {
	
	
	

	public Pig(String meal) {
		super(meal);
	}

	@Override
	public void eat() {
		System.out.println("가리지 않음");
		super.eat();
	}

	@Override
	public void move() {
		System.out.println("생각보다 빠르다.");
		super.move();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	

}
