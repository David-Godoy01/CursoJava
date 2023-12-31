package lambda.pratical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wraaangler", "Red", 24500)
				);

		Function<Car,String> priceAndColor = (c) -> " price = "+	c.getPrice() +" color = "+ c.getColor();		;
		String stringCar = priceAndColor.apply(cars.get(0));
		System.out.println(stringCar);



		System.out.println("Printing cars between price 18000 and 22000");
		printCars1(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);

		System.out.println("Print blue cars");
		printCars1(cars, (c) -> c.getColor().equals("Blue"));

	}
	

	public static void printCars1(List<Car> cars, Predicate <Car> predicate) {
		for(Car c: cars) {
			if(predicate.test(c)) {
				c.printCar();
			}
		}
	}


	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
		for(Car c: cars) {
			if(low <= c.getPrice() && c.getPrice() <= high) {
				c.printCar();
			}
		}
	}


	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c: cars) {
			if(predicate.test(c)) {
				c.printCar();
			}
		}
	}

}
