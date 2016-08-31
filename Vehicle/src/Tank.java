
public class Tank extends Vehicle{
	
	private double armorWidth;
	
	public Tank() {
		super();
		double armorWidth = 0.0;
	}
	
	public Tank(int year, double weight, double armorWidth) {
		super(year, weight);
		this.armorWidth = armorWidth;
	}

	public double getArmorWidth() {
		return armorWidth;
	}

	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}
	
	public String toString() {
		return "Year: " + getYear() + " Weight: " + getWeight() + " Armor Width: " + armorWidth;
	}

}
