/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 TestGeometricObject
 */

public class TestGeometricObject {

	public static void main(String[] args) {

		GeometricObject A = new Circle(5);
		A.setColor("Red");

		GeometricObject B = new Rectangle(5, 10);
		B.setColor("Blue");

		System.out.println("Do the two objects have the same color? " +
		compareColor(A, B) + "\nDo the two objects have the same area? " +
		compareArea(A, B) + "\nDo the two objects havre the same perimeter? " + 
		
		comparePerimeter(A, B));

		displayGeometricObject(A);

		displayGeometricObject(B);

	}

	public static boolean compareArea(GeometricObject object1,

			GeometricObject object2) {

		return object1.getArea() == object2.getArea();

	}

	public static boolean compareColor(GeometricObject object1,

			GeometricObject object2) {

		return object1.getColor() == object2.getColor();

	}

	public static boolean comparePerimeter(GeometricObject object1,

			GeometricObject object2) {

		return object1.getPerimeter() == object2.getPerimeter();

	}

	public static void displayGeometricObject(GeometricObject object) {

		System.out.println();
		
		System.out.println("The color is " + object.getColor());

		System.out.println("The area is " + object.getArea());

		System.out.println("The perimeter is " + object.getPerimeter());

	}

}
