import java.util.*;
public class SimpleUserInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();

		System.out.println("Enter the first number (which can contain a decimal)");
		double n1 = Double.parseDouble(in.nextLine());
		System.out.println("Enter the second number (which can contain a decimal)");
		double n2 = Double.parseDouble(in.nextLine());
		System.out.println(name + ", the numbers you entered were: " +n1+" " + n2);
		System.out.println("The average of the two numbers is " + (n1+n2)/2);
		
		
		
		in.close();
	}

}
