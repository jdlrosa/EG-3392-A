/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 3 TestShip
 */
public class TestShip {

	public static void main(String[] args) {
		
		Ship[] array = new Ship[3];
		
		Ship Triumph = new Ship("Triumph", "1960");
		array[0] = Triumph;
		
		Ship Disney = new CruiseShip("Disney Magic", "year", 2400);
		array[1] = Disney;
		
		Ship Pearl = new CargoShip("Black Pearl", "year", 50000);
		array[0] = Pearl;
		
		System.out.println(Triumph.toString()); //Calling the array elements in a for loop would be better.
		System.out.println(Disney.toString());
		System.out.println(Pearl.toString());
		
		
	}
	
}
