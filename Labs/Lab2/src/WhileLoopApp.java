import java.util.Scanner;

public class WhileLoopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int total = 0;
		while(i <=2) {
			System.out.println("Enter integer " +i+ ":");
			int x = input.nextInt();
			total += x;
			i++;
		}
		
		double average = total/ 2.0;
		System.out.println("Average is " +average);
		input.close();

	}

}