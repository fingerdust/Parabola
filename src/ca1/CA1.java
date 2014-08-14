package ca1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * This class generates 50,000 coordinates within the (0,0) (3.1415, 9.8590)
 * rectangle. An ArrayList is used to store coordinates and iterated over to
 * find what proportion of coordinates are below the curve y=x^2. ie. The monte
 * carlo method is used to find the area under that curve in the range x = 0 to
 * x = pi. CA1 has a static nested class used for creating the ArrayList and
 * storing.
 * 
 * @author Mark Tobin
 * */
public class CA1 {
	/**
	 * A class which contains the methods to populate an ArrayList, calculate
	 * the Monte Carlo percentage and the area under the curve.
	 * 
	 * @author Mark Tobin
	 */
	static class ParaCalc {
		/** Upper bounds of the rectangle (Lower bounds implicitly 0) */
		double maxX = 3.1415;
		/** Upper bounds of the rectangle (Lower bounds implicitly 0) */
		double maxY = 9.8590;
		/** Area of the rectangle */
		double area = maxX * maxY;
		/** List which will store coordinates */
		List<Coordinate> coordinateList = new ArrayList<Coordinate>();

		/**
		 * A method which generates 50000 Coordinates and adds them to a list
		 */
		public void createList() {
			Random r = new Random();
			for (int i = 0; i < 50000; i++) {
				// A random between 0 and the upper bound on the x axis
				double x = maxX * r.nextDouble();
				// A random between 0 and the upper bound on the y axis
				double y = maxY * r.nextDouble();
				// Create a coordinate and add it to the arrayList.
				coordinateList.add(new Coordinate(x, y));
			}
		}

		/**
		 * A method which calls createList() and finds the percentage of
		 * coordinates which lie below the curve y=x^2 bounded by x=0, x=pi
		 * 
		 * @return percentage - Percentage of points which lie below the curve
		 */
		public double findPercentage() {
			createList();
			// Create an iterator to iterate over the arrayList
			Iterator<Coordinate> it = coordinateList.iterator();
			double count = 0;
			while (it.hasNext()) {
				Coordinate c = it.next(); // An x, y coordinate
				if (c.y < (c.x * c.x)) { // If the coordinate lies below the
											// curve
					count++; // Count values below curve
				}
			}
			// Calulate the percentage of points below the curve.
			double percentage = (count / 50000) * 100;
			return percentage;
		}

		/**
		 * Method calls findPercentage() and uses the Monte Carlo percentage to
		 * calculate area.
		 * 
		 * @return areaCalc - The calculate area under the curve y=x^2 bounded
		 *         by 0 and pi.
		 */
		public double findArea() {
			double percentage = findPercentage();// Percentage of coordinates
													// below the curve.
			double areaCalc = (area * percentage) / 100; // Area under curve.
			return areaCalc;
		}
		public void sayIt(){
			System.out.println("Say IT!"); 
		}
	}
}
