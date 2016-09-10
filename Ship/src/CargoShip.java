/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 3 CargoShip
 */
public class CargoShip extends Ship{

	private int capacity;

	public CargoShip(){
		super();
		int capacity = 0;
	}

	public CargoShip(String shipName, String shipYear, int capacity){
		super(shipName, shipYear);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString() {
		return "Name: " + getShipName() + "\nCargo Capacity: " + capacity + " tons";
	}
}
