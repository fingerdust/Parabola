package ca1;
import ca1.CA1.ParaCalc;

/**
 * Class which prints the value of the area under a curve y=x^2 from 0 to pi.
 * Contains a main method which calls the methods of CA1.java and prints the
 * results. Tests the calculated value against the value solved by analysis of
 * the integral.
 * 
 * @author Mark Tobin
 * 
 */
public class CA1Test {
	/**
	 * Calculate the value of INT(x^2)dx|x=0 to x=pi
	 * 
	 * @return area - The area under the curve y=x^2 bounded by x=0,3.1415
	 */
	public static double valueByIntegration() {
		double area = (3.1415 * 3.1415 * 3.1415) / 3;
		return area;
	}

	/**
	 * Method which calls the methods of CA1 and prints the resulting area. Also
	 * prints the solved area.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CA1.ParaCalc pc = new CA1.ParaCalc();
		pc.sayIt(); 
		System.out.println("The area under the curve y=x^2 bounded by x=0 and x=pi");
		System.out.print("Estimated using the Monte Carlo method:	");
		System.out.println(pc.findArea());
		System.out.print("Solved by analysis of INT(x^2)dx|x=0 to x=pi:	");
		System.out.println(valueByIntegration());

	}

}
