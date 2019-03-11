package points_v1;

/*
 * THis class is a template for 2D point
 * At runtime, we may instantiate as many 2D point instances as we wish
 */
public class Point {
	/*
	 * Attributes: class-level variable.
	 * The scope of attributes are every method in the current class.
	 */
	double x; //typically you do not initialize the attribute here.
	double y;
	
	/*
	 * Constructors: "methods" for constructing new instances of Point
	 * Note: Here we are DEFINING constructors. 
	 * Rule: name of constructor must be the SAME as the class name.
	 */
	
	//Version 1: create a new Point using two values for x and y.
	Point(double newX, double newY) {
		x = newX;
		y = newY;
		// newX = x; not right: you should never re-assign input parameter
		
	}
	//Version 2: create a new Point either along the X axis or along the Y axis.
	//Assumption: axis can either be 'x' (if a point is created along the x-axis) or 'y'
	Point(char axis, double distance) {
		if(axis == 'x') {
			x = distance;
			y= 0;
		}
		else {
			x = 0;
			y = distance;
		}
		
	}
	
	/*
	 * Adding these two versions of constructors will give a compile-time error
	 * Because from the compiler's point of view,
	 * both are expecting a single double value, so when you call Point(3,4),
	 * it is confusing to which version to call. Hence the compile time error.
	 * 
	 * Point (double distanceFromXAxis) {
	 * 
	 * }
	 * 
	 * Point (double distanceFromYAxis) {
	 * 
	 * }
	 */
	
}
