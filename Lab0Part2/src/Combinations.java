import java.util.*;
public class Combinations {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String ints[] = new String[4];
		String strings[] = new String[4];
		
		System.out.println("Enter the 1st string:");
		strings[0] = in.nextLine();
		System.out.println("Enter the 2nd string:");
		strings[1] = in.nextLine();
		System.out.println("Enter the 3rd string:");
		strings[2] = in.nextLine();
		System.out.println("Enter the 4th string:");
		strings[3] = in.nextLine();
		
		System.out.println("Enter the 1st integer:");
		ints[0] = in.nextLine();
		System.out.println("Enter the 2nd integer:");
		ints[1] = in.nextLine();
		System.out.println("Enter the 3rd integer:");
		ints[2] = in.nextLine();
		System.out.println("Enter the 4th integer:");
		ints[3] = in.nextLine();
		
		System.out.println("Here are all 16 possible combinations:");
		
		for(int i = 0; i < 4;i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("("+strings[i]+", "+ints[j]+")");
			}
		}
		
		in.close();
	}

}
