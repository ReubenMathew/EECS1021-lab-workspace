import java.util.*;
public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an integer for radius:");
		int r = Integer.parseInt(in.nextLine());
		System.out.println("What's you name?");
		String name = in.nextLine();
		double perimeter = r *2* 3.14;
		double area = r*r*3.14;
		System.out.println(name+", your input circle with radius "+r+" has perimeter "+perimeter+" and area "+area);
	}

}
