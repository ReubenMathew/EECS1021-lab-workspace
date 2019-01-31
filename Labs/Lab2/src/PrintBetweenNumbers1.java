import java.util.Scanner;
public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter a lower bound:");
		int lowBound = in.nextInt();
		System.out.println("Enter an upper bound:");
		int highBound = in.nextInt();
		
		if(lowBound > highBound) {
			System.out.println("Error: lower bound "+lowBound+" is not less than or equal to the upper bound "+highBound+".");
			System.out.println("Bye!");
		}else {
			for(int i = lowBound; i <= highBound; i++) {
				System.out.println(i);
			}
			System.out.println("Bye!");
		}
		in.close();
	}
}
