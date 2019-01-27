import java.util.Scanner;
public class LogicalOperationsApp3a {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer that is not between 1 and 10");
		int i=input.nextInt();
		boolean com=(i<1)||(i>10);
		System.out.println("the number you entered  "+i+" is not between 1 and 10 "+com);
	}

}
