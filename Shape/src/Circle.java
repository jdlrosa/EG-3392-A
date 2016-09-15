/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 4 Circle
 */
public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius){
		super();
		this.radius = radius;
	}
	
	public Circle(){
		super();
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + "]";
	}
	
}
