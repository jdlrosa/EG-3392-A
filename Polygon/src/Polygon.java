/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 3 Polygon
 */
public class Polygon extends GeometricObject1{
	
	private int side;
	private int sideLength;
	
	public Polygon(){
		int side = 0;
		int sideLength = 0;
	}
	
	public Polygon(int side, int sideLength){
		this.side = side;
		this.sideLength = sideLength;
	}
	
	public double getPerimeter(){
		return sideLength * side;
	}
	
	public double getAngle(){
		return ((side - 2) * (180 / side));
	}

	public int getSide() {
		return side;
	}

	public int getSideLength() {
		return sideLength;
	}
	

}
