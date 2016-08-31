
public class Truck extends Automobile {
	
	double towCapacity;
	
	public Truck() {
		super();
		double towCapacity = 0.0;
	}
	
	public Truck(int year, double weight, String licensePlate, String make, double towCapacity) {
		super(year, weight, licensePlate, make);
		this.towCapacity = towCapacity;
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}
	
	public String toString() {
		return "Year: " + getYear() + " Weight: " + getWeight() + " LicensePlate: " + getLicensePlate() + " Make: " + getMake() + " TowCapacity: " + towCapacity;
	}

}
