/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 Rectangle
 */
public class Rectangle extends GeometricObject implements Comparable {

	private double width;

	private double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {

		this.width = width;

		this.height = height;

	}

	public double getWidth() {

		return width;

	}

	public void setWidth(double width) {

		this.width = width;

	}

	public double getHeight() {

		return height;

	}

	public void setHeight(double height) {

		this.height = height;

	}

	public double getArea() {

		return width * height;

	}

	public double getPerimeter() {

		return 2 * (width + height);

	}
	
	public boolean compareColor(GeometricObject object1,

			GeometricObject object2) {

				return object1.getColor() == object2.getColor();

			}
	
	public boolean compareArea(GeometricObject object1,

			GeometricObject object2) {

				return object1.getArea() == object2.getArea();

			}
	public boolean comparePerimeter(GeometricObject object1,

			GeometricObject object2) {

				return object1.getPerimeter() == object2.getPerimeter();

			}

}
