
public class DuckDriver {

	public static void main(String[] args) {
		Duck mduck = new MallardDuck();
		mduck.performFly();
		mduck.PerformQuack();
		mduck.swim();
		mduck.display();
		mduck.setFlyBehavior(new FlyNoWay());
		mduck.performFly();
		mduck.setFlyBehavior(new FlyWithRocket());
		mduck.performFly();
		
		Duck myDuck = new MyDuck();
		myDuck.performFly();
		myDuck.PerformQuack();
		myDuck.swim();
		myDuck.display();

	}

}
