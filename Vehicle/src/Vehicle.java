
public class Vehicle {

	private int year;
	private double weight;
	
	public Vehicle(){
		int year = 0;
		double weight = 0.0;
	}
	
	public Vehicle(int year, double weight){
		this.year = year;
		this.weight = weight;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	} 
	
	public String toString() {
		return "Year: " + year + " Weight: " + weight;
	}
	
}
