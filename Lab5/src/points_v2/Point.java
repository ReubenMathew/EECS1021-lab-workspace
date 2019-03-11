package points_v2;

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
	Point(double x, double y) {
		this.x = x; //"this refers to the new object being created
		this.y = y;
//		x=x; // inappropriate: assign input x to input x itself
//		this.x=this.x //inappropriate: assign attribute x to attribute x itself
		
	}
	//Version 2: create a new Point either along the X axis or along the Y axis.
	//Assumption: axis can either be 'x' (if a point is created along the x-axis) or 'y'
	Point(char axis, double distance) {
		/*
		 * Here the names of parameters 'axis' and 'distance'
		 * do not clash with any of the attribute names (x,y).
		 * So we do not have to use this.x to disambiguate.
		 * 
		 * In such a case where the use of 'this' is not necessary (because there will not be any name clash
		 * the use of 'this' is simply implicit.
		 */
		if(axis == 'x') {
			this.x = distance;
			this.y= 0;
		}
		else {
			this.x = 0;
			this.y = distance;
		}
		
	}
	
	/*
	 * Accessors: methods for inquiring about the point.
	 */
	double getDistanceFromOrigin() {
		double distance = 0.0;
		/*
		 * Re-assign the result, so that 
		 * it is going to store the correct output value to be returned.
		 */
		distance = Math.sqrt(this.x*this.x + Math.pow(y,2));
		
		return distance;
	}
	String getDescription() {
		String description = "";
		
		description = "(" + this.x + "," + this.y + ")";
		
		return description;
	}
	
	double getDistanceFrom(Point other) {
		double distance = 0.0;
		
		distance = Math.sqrt(
				Math.pow((this.x - other.x),2) +
				Math.pow(this.y - other.y, 2)
				);
		
		return distance;
	}
	/*
	 * Mutators: modifying the attribute values of the context objects (this).
	 * Assumptions on the direction: 'L' for LEFT, 'R' for RIGHT, 'U' for UP, and 'D' for DOWN.
	 */
	void move(char direction, double units) {
		if(direction == 'U') {
			this.y = this.y + units;
		}
		else if(direction == 'D') {
			this.y = this.y - units;
		}
		else if(direction == 'L') {
			this.x = this.x-units;
		}
		else { //direction == 'R'
			this.x = this.x + units;
			
		}
	}
}
