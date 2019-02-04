import java.util.Scanner;
public class PrintBetweenNumbers4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println("Enter a lower bound:");
			int lowBound = in.nextInt();
			System.out.println("Enter an upper bound:");
			int highBound = in.nextInt();
			System.out.println("Enter a middle number:");
			int mid = in.nextInt();
			
			if(lowBound > highBound) {
				System.out.println("Error: lower bound "+lowBound+" is not less than or equal to the upper bound "+highBound+".");
			}else if(!((mid>=lowBound)&&(mid<=highBound))){
				System.out.println("Error: middle number is not in-beween the lower and upper bounds.");
			}else {
				System.out.println("Odd numbers between "+lowBound+" and "+mid+":");
				for(int i = lowBound; i <= mid; i++)
					if(i%2!=0)System.out.println(i);
				System.out.println("Odd numbers between "+mid+" and "+highBound+":");
				for(int i = mid; i <= highBound; i++)
					if(i%2==0)System.out.println(i);
			}in.nextLine();
			while(true) {
				System.out.println("Would you like to continue printing? (Y/N)");
				String ans = in.nextLine();
				if((!ans.equals("Y"))&&(!ans.equals("N"))) 
					System.out.println("Invalid indication on continuation: "+ans);
				if(ans.equals("N")) {
					loop = false;
					break;
				}
				if(ans.equals("Y"))
					break;
		}
		System.out.println("Bye!");
	}
}