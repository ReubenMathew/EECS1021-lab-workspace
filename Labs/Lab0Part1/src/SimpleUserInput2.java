import java.util.*;
public class SimpleUserInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		int i = in.nextInt();
		
		int square = i*i;
		System.out.println("The square of " + i + " is " + square +".");
		in.close();
	}

}
