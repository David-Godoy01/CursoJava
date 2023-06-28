
public class Fish extends Animal {
	
	public Fish(String gender, int age, double weight) {
		super(gender, age, weight);
	}

	public void swim() {
		System.out.println("Swimming...");
	}

	public void move() {
		System.out.println("Fish is swimming...");
		
	}
}
