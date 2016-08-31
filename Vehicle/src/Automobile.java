/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 2 Automobile 
 */
public class Automobile extends Vehicle {

	private String licensePlate;
	private String make;

	public Automobile() {
		super();
		String licensePlate = "unknown";
		String make = "unknown";
	}

	public Automobile(int year, double weight, String licensePlate, String make) {
		super(year, weight);
		this.licensePlate = licensePlate;
		this.make = make;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String toString() {
		return "Year: " + getYear() + " Weight: " + getWeight() + " LicensePlate: " + licensePlate + " Make: " + make;
	}

}
