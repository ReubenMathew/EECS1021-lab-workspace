import java.util.Scanner;
public class PrintBetweenNumbers2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a lower bound:");
			int lowBound = in.nextInt();
			System.out.println("Enter an upper bound:");
			int highBound = in.nextInt();
			
			if(lowBound > highBound) {
				System.out.println("Error: lower bound "+lowBound+" is not less than or equal to the upper bound "+highBound+".");
			
			}else {
				for(int i = lowBound; i <= highBound; i++)
					System.out.println(i);
			}
			
			System.out.println("Would you like to continue printing? (Y/N)");
			in.nextLine();
			String ans = in.nextLine();
			if(ans.equals("N"))
				break;
		}
		System.out.println("Bye!");
	}
}
