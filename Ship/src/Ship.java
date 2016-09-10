/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 3 Ship
 */
public class Ship {

	private String shipName;
	private String shipYear;
	
	public Ship(){
		String shipName = "unknown";
		String shipYear = "unknown";
	}
	
	public Ship(String shipName, String shipYear){
		this.shipName = shipName;
		this.shipYear = shipYear;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipYear() {
		return shipYear;
	}

	public void setShipYear(String shipYear) {
		this.shipYear = shipYear;
	}
	
	public String toString(){
		return "Name: " + shipName + "\nYear Built: " + shipYear;
	}
}
