import java.util.Scanner;

public class ForLoopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter integer 1:");
//		int i1 = input.nextInt();
//		
//		System.out.println("Enter integer 2:");
//		int i2 = input.nextInt();
//		
//		System.out.println("Enter integer 3:");
//		int i3 = input.nextInt();
//		
//		System.out.println("Enter integer 4:");
//		int i4 = input.nextInt();
//		
//		System.out.println("Enter integer 5:");
//		int i5 = input.nextInt();
		int sum = 0;
		int avg = 0;
		for(int i = 1; i<=5; i++) {
			System.out.println("Enter integer " +i+":");
			int x = input.nextInt();
			sum += x;
		}
		avg = sum/5;
		System.out.println("the avegrage is " +avg);
		input.close();

	}

}