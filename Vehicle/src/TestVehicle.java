/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 2 Test
 */
public class TestVehicle {

	public static void main(String[] args) {
		
		Car Honda = new Car(2006, 2100.56, "1RT245", "Honda", 5);
		Truck Dodge = new Truck(2009, 2500.45, "2TU123", "Dodge", 1200.0);
		Tank Tank = new Tank(2011, 7000.56, 4.56);
		
		System.out.println("Honda: " + Honda.toString());
		System.out.println("Dodge: " + Dodge.toString());
		System.out.println("Tank: " + Tank.toString());
		

	}

}
