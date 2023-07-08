package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
//		
//		for(String value : animals) {
//			System.out.println(value);
//		}
		
		LinkedList <Vehicle> vehicles = new LinkedList<Vehicle>();
		
		Vehicle vehicle2= new Vehicle("Toyota", "Camary", 12000,false);
		vehicles.add(vehicle2);
		
		vehicles.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
//		for(Vehicle cars : vehicles) {
//			System.out.println(cars);
//			
//		}
		
			printElements(vehicles);
			printElements(animals);
		}
	
	public static void printElements(List someList) {
		for(int i = 0; i < someList.size();i++) {
			System.out.println(someList.get(i));
		}
	}
}
