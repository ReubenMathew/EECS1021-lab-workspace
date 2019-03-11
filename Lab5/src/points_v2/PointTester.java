package points_v2;

public class PointTester {

	public static void main(String[] args) {
		/*
		 * Create point objects.
		 */
		
		//This is where we call/use the constructor.
		Point p1 = new Point(3,-4); //calling the 1st version of constructor
		Point p2 = new Point(-2,-7); // calling the 1st version of constructor
		Point p3 = new Point('y',8); //calling the 2nd version of the constructor
		Point p4 = new Point('x',-5); //calling the 2nd version of the constructor
		
		System.out.println(p1); //prints out pseudo-address
		System.out.println(p2);
		System.out.println("p1 and p2 store different adresses: " + (p1!=p2));
		System.out.println("p1 and p2 store the same adress: " + (p1==p2));
		System.out.println(p3);
		System.out.println(p4);
		
//		//Version 1 with variables storing return values of accessor method calls
//		double dist1 = p1.getDistanceFromOrigin();
//		double dist2 = p3.getDistanceFromOrigin();
//		
//		String desc2 = p3.getDescription();
//		String desc1 = p1.getDescription();
//		
//		double dist3 = p1.getDistanceFrom(p3);
//
//		System.out.println("Description of p1: " + desc1);
//		System.out.println("Description of p1: " + desc2);
//		System.out.println("Distance of p1 from (0,0): " + dist1);
//		System.out.println("Distance of p1 from (0,0): " + dist2);
//		System.out.println("Distance of p1 from p3: " + dist3);
//		
//		p1.move('R', 3.2);
//		p3.move('D', 4.7);
//		System.out.println("After moving p1 and p3");
//		
//
//		desc2 = p3.getDescription();
//		desc1 = p1.getDescription();		
//		dist1 = p1.getDistanceFromOrigin();
//		dist2 = p3.getDistanceFromOrigin();
//		dist3 = p3.getDistanceFromOrigin();
//		System.out.println("Description of p1: " + desc1);
//		System.out.println("Description of p1: " + desc2);
//		System.out.println("Distance of p1 from (0,0): " + dist1);
//		System.out.println("Distance of p1 from (0,0): " + dist2);
//		System.out.println("Distance of p1 from p3: " + dist3);
//		
		//Version 2: print out accessor method call return values directly.

		System.out.println("Description of p1: " +  p1.getDescription());
		System.out.println("Description of p1: " + p3.getDescription());
		System.out.println("Distance of p1 from (0,0): " + p1.getDistanceFromOrigin());
		System.out.println("Distance of p1 from (0,0): " + p3.getDistanceFromOrigin());
		System.out.println("Distance of p1 from p3: " + p1.getDistanceFrom(p3));
		
		p1.move('R', 3.2);
		p3.move('D', 4.7);
		System.out.println("After moving p1 and p3");
		
		
		System.out.println("Description of p1: " + p1.getDescription());
		System.out.println("Description of p1: " + p3.getDescription());
		System.out.println("Distance of p1 from (0,0): " +  p1.getDistanceFromOrigin());
		System.out.println("Distance of p3 from (0,0): " + p3.getDistanceFromOrigin());
		System.out.println("Distance of p1 from p3: " + p1.getDistanceFrom(p3));
		
		
	}

}
