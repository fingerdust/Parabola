package ca1;
/**
 * A class which represents a coordinate on the x, y plane.
 */
public class Coordinate {
	public double x;
	public double y;

	/**
	 * Class constructor which takes a pair of double values to create a
	 * coordinate point.
	 */
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/** A method which returns a coordinate as a string */
	public String stringCoordinate() {
		return "(" + Double.toString(x) + ", " + Double.toString(y) + ")";
	}
}