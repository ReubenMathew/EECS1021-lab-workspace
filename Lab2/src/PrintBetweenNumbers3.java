import java.util.Scanner;
public class PrintBetweenNumbers3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println("Enter a lower bound:");
			int lowBound = in.nextInt();
			System.out.println("Enter an upper bound:");
			int highBound = in.nextInt();
			
			if(lowBound > highBound) {
				System.out.println("Error: lower bound "+lowBound+" is not less than or equal to the upper bound "+highBound+".");
			
			}else {
				for(int i = lowBound; i <= highBound; i++)
					System.out.println(i);
			}in.nextLine();
			while(true) {
				System.out.println("Would you like to continue printing? (Y/N)");
				
				String ans = in.nextLine();
				if((!ans.equals("Y"))&&(!ans.equals("N"))) {
					System.out.println("Invalid indication on continuation: "+ans);
				}
				if(ans.equals("N")) {
					loop = false;
					break;
				}
				if(ans.equals("Y"))
					break;
			}
		}
		System.out.println("Bye!");
	}
}
