import java.util.Scanner;
public class ifStatementsApp3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer balance:");
		int bal=input.nextInt();
		System.out.println("Enter an amount to withdraw:");
		int am=input.nextInt();
		if(bal<0) {
			System.out.println("Error:Balance  should not be negative");

		}else if(am<0){
			System.out.println("Error:Ammount to withdraw should not be negative");
		}else if(am>=bal){
			System.out.println("Error:Ammount to withdraw should be smaller than balance");
		}else {
			System.out.println("Initial balance "+bal+" after withdrawing "+am);
			bal=bal-am;
			System.out.println("Has the resulting balance "+bal);


		}


	}

}
