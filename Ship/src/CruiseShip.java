/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 3 CruiseShip
 */
public class CruiseShip extends Ship {
	
	private int passengers;
	
	public CruiseShip(){
		super();
		int passengers = 0;
	}
	
	public CruiseShip(String shipName, String shipYear, int passengers){
		super(shipName, shipYear);
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public String toString(){
		return "Name: " + getShipName() + "\nMaximum Passengers: " + passengers;
	}

}
