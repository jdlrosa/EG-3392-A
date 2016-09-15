/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 4 Shape
 */
public class Shape {
	
	private String color;
	
	public Shape(String color){
		this.color = color;
	}
	
	public Shape(){
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} 
	
	public double getArea(){
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
}
