import java.util.Scanner;
public class LogicalOperationsApp2b {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 10");
		int i=input.nextInt();
		boolean bet= (1<=i)||(i<=10);
		System.out.println("The number you entered "+i+" is between 1 and 10: "+ bet);
	}

}
