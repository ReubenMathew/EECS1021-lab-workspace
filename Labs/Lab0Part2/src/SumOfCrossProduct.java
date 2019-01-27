import java.util.*;
public class SumOfCrossProduct {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int nums[][] = new int[2][4];
		
			System.out.println("Enter the 1st integer in sequence 1:");
			nums[0][0] = in.nextInt();
			System.out.println("Enter the 2nd integer in sequence 1:");
			nums[0][1] = in.nextInt();
			System.out.println("Enter the 3rd integer in sequence 1:");
			nums[0][2] = in.nextInt();
			System.out.println("Enter the 4th integer in sequence 1");
			nums[0][3] = in.nextInt();
			System.out.println("Enter the 1st integer in sequence 2");
			nums[1][0] = in.nextInt();
			System.out.println("Enter the 2nd integer in sequence 2");
			nums[1][1] = in.nextInt();
			System.out.println("Enter the 3rd integer in sequence 2");
			nums[1][2] = in.nextInt();
			System.out.println("Enter the 4th integer in sequence 2");
			nums[1][3] = in.nextInt();
			
		int sum = cross(nums,0);
		System.out.println("sum("+Arrays.toString(nums[0])+" * "+Arrays.toString(nums[1])+") = " + sum);
		in.close();
	}
	public static int cross(int n[][], int m) {
		if(m==4) 
			return 0;
		return n[0][m] * n[1][m] + cross(n,m+1);
	}

}