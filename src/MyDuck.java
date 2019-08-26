
public class MyDuck extends Duck {
	
	public MyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("My Duck is cute");

	}

}
