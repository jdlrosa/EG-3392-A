/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 3 Octagon
 */
public class Octagon extends Polygon {

	public Octagon() {
		super();
	}

	public Octagon(int side, int sideLength) {
		super(side, sideLength);
	}

	public double getArea() {
		return ((2 + 2 * Math.sqrt(2)) * Math.pow(getSideLength(), 2));
	}

	public String toString(){
		return "An octagon has " + getSide() + " sides \nA side length of " 
				+ getSideLength() + "\nAn area of " + getArea() + "\nA perimeter of "
				+ getPerimeter() + "\nAn internal angle of " + getAngle() + "\n"
				+ getDateCreated();
				
	}
}
