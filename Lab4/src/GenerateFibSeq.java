import java.util.Scanner;

class GenerateFibSeq {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the size of Fibonacci Sequence:");
			int size = in.nextInt();
			if(size<1) {
				System.out.println("Error: Fibonacci Sequence must have a size >= 1.");
			}else {
				int num1 = 1, num2 = 1;
				int i=1; System.out.print("<"+num1);
		        while(i<=(size-1)) {
		        	int sumOfPrevTwo = num1 + num2;
		            num1 = num2; num2 = sumOfPrevTwo;
		        	System.out.print(","+num1); i++;
		        } System.out.print(">");
			}
			System.out.println("\nWould you like to continue? (Y/N)");
			in.nextLine(); String ans = in.nextLine(); 
			if(ans.equals("N")) {System.out.println("Bye!"); break;}
		} in.close();
	}
}