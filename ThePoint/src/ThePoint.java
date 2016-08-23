/*
 * Julian De La Rosa
 * EG 3392 A
 * The Point
 */

public class ThePoint {
	private int x;
	private int y;

	public ThePoint() {
		x = 0;
		y = 0;
	}

	public ThePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int distance(ThePoint point) {
		// Distance = sqrt( (X2-X1)^2 = (Y2-Y1)^2 )
		double a = Math.pow((double) (point.getX() - x), 2.0);
		double b = Math.pow((double) (point.getY() - y), 2.0);

		int answer = (int) Math.sqrt(a + b);

		return answer;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
