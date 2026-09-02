package Day04;

public class Tiger extends Animal {

	@Override
	public void eat() {
		System.out.println("고기");
		super.eat();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}

	@Override
	public void sleep() {
		System.out.println("엎드려서 잔다.");
		super.sleep();
	}

	public Tiger(String meal) {
		super(meal);
	}
	

}
