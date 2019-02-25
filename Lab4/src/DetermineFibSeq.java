import java.util.Arrays;
import java.util.Scanner;
public class DetermineFibSeq {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
		int count = 0; int[] nums = new int[20];
		for(int i = 0; i < nums.length; i++){
			System.out.println("Enter a positive integer or -1 to stop:");
			int ans = in.nextInt();
			if(ans == -1) break;
			nums[i] = ans; count++;
		}
		int[] fibs = new int[count]; int[] foo = new int[count];
		for(int i = 0; i < count; i++) fibs[i] = nums[i];
		int num1 = 1, num2 = 1;
		int i = 1; foo[0] = num1;
        while(i<=(count-1)) {
        	int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        	foo[i] = num1;
            i++;
        }
        System.out.print("The sequence you entered <"); 
        for(int j = 0; j < count-1;j++) System.out.print(fibs[j]+", ");
        System.out.print(fibs[count-1]+">\n");
        System.out.println(Arrays.equals(fibs,foo)?"is the first "+count+" numbers in the fibonacci sequence.":"is not the first "+count+" numbers in the fibonacci sequence.");
        System.out.println("Would you like to try another sequence (Y/N)");
        in.nextLine(); String yn = in.nextLine();
        if(yn.equals("N")) { System.out.println("Bye!"); break;}
		}
	}
}