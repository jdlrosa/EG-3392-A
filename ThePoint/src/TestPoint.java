/*
 * Julian De La Rosa
 * EG 3392 A
 * Test Point
 */

import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int x1;
		int x2;
		int y1;
		int y2;

		System.out.println("Point 1:");
		System.out.print("x: ");
		x1 = keyboard.nextInt();
		System.out.print("y: ");
		y1 = keyboard.nextInt();
		ThePoint p1 = new ThePoint(x1, y1);

		System.out.println("Point 2:");
		System.out.print("x: ");
		x2 = keyboard.nextInt();
		System.out.print("y: ");
		y2 = keyboard.nextInt();
		ThePoint p2 = new ThePoint(x2, y2);

		System.out.println("Point 1: " + p1.toString());
		System.out.println("Point 2: " + p2.toString());
		System.out.println("Distance: " + p1.distance(p2));

		keyboard.close();
	}
}
