import java.util.*;
public class SumOfCrossProduct {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int nums[][] = new int[2][4];
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter the 1st integer in sequence "+(i+1)+":");
			nums[i][0] = in.nextInt();
			System.out.println("Enter the 2nd integer in sequence "+(i+1)+":");
			nums[i][1] = in.nextInt();
			System.out.println("Enter the 3rd integer in sequence "+(i+1)+":");
			nums[i][2] = in.nextInt();
			System.out.println("Enter the 4th integer in sequence "+(i+1)+":");
			nums[i][3] = in.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			sum += nums[0][i]*nums[1][i];
		}
		
		System.out.println("sum("+Arrays.toString(nums[0])+" * "+Arrays.toString(nums[1])+") = " +sum);
		
		in.close();
	}

}
