/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 4 TestShape
 */
public class TestShape {

	public static void main(String[] args) {
		
		Shape[] array = new Shape[3];
		
		Shape s1 = new Shape("Black");
		array[0] = s1;
		
		Shape s2 = new Circle(5);
		s2.setColor("Red");
		array[1] = s2;
		
		Shape s3 = new Rectangle(5,10);
		s3.setColor("Blue");
		array[2] = s3;
		
		
		for(Shape shapeObject : array){
			System.out.println(shapeObject.toString() + ", Area: " + shapeObject.getArea());
		}
		

	}

}
