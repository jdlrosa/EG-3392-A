/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 Circle
 */
public class Circle extends GeometricObject implements Comparable {

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {

		this.radius = radius;

	}

	public double getRadius() {

		return radius;

	}

	public void setRadius(double radius) {

		this.radius = radius;

	}

	public double getArea() {

		return radius * radius * Math.PI;

	}

	public double getPerimeter() {

		return 2 * radius * Math.PI;

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
