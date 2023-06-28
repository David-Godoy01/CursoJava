
public class Sparrow extends Bird implements Flyable {

	public Sparrow(String gender, int age, double weight) {
		super(gender, age, weight);
	}

	public void fly() {
		System.out.println("Sparrow flying high...");
		
	}

}
