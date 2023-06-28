
public class Chicken extends Bird{

	public Chicken(String gender, int age, double weight) {
		super(gender, age, weight);
		
	}
	//overriding the method defined in Bird
	public void fly() {
		System.out.println("Not able to fly...");
	}

}
