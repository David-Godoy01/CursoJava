
public abstract class Animal {

	String gender;
	int age;
	double weight;
		
	public Animal(String gender, int age, double weight) {
		super();
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
	public void spec() {
		System.out.println("Sex is "+gender);
		System.out.println("there has "+age+" years old");
		System.out.println("And "+weight+" lb");
	}
	public void eat() {
		System.out.println("eating..");
	}
	public void sleep() {
		System.out.println("sleeping..");
	}
	public abstract void move();

}

