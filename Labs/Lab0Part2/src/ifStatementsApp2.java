import java.util.Scanner;
public class ifStatementsApp2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer balance:");
		int bal=input.nextInt();
		System.out.println("Enter an amount to withdraw:");
		int am=input.nextInt();
		if(bal<0||am<0||am>=bal) {
			System.out.println("Error:Launch the program again");

		}else {
			System.out.println("Initial balance "+bal+" after withdrawing "+am);
			bal=bal-am;
			System.out.println("Has the resulting balance "+bal);


		}


	}

}
