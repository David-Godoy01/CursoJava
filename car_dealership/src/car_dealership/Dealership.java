package car_dealership;

public class Dealership {
	
	

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom","123 Anything St. ",25000);
		
		
		Vehicle vehicle = new Vehicle("BMW", "M3", 20000);
		
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
		/**
		 * doubleAmount=vehiclePrice - cashOnhand;
		 * 
		 * handleCustumer (Customer, boolean finance, Vehicle vehicle)
		 * 	if(finance == true)
		 * 		runCreditHistory(Customer cust, double doubleAmount)
		 * else if (vehicle.getPrice() <= cust.getcashOnHand(){
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 * }
		 * else{
		 * 		tell customer to bring more money
		 * }
		 * 
		 * 
		 * 
		 */

	}

}
