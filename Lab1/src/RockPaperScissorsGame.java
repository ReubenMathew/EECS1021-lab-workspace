import java.util.Scanner;
public class RockPaperScissorsGame {


	public static void main(String[] args) {
		
		int playerOne = 0; String oneName;
		int playerTwo = 0; String twoName;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the name of player 1:"); oneName = in.nextLine();
		System.out.println("Enter the name of player 2:"); twoName = in.nextLine();
		
		if(playerOne==2) {
			System.out.println("Game over "+oneName+" wins!"); return;
		}else if(playerTwo==2) {
			System.out.println("Game over "+twoName+" wins!");return;
		}else {
			System.out.println("========\nRound "+1+":\n========");
			System.out.println("What does "+oneName+" play? (R, P, or S)"); String one = in.nextLine();
			System.out.println("What does "+twoName+" play? (R, P, or S)");	String two = in.nextLine();
		if((one.equals("R")&&two.equals("S"))||(one.equals("P")&&two.equals("R"))||(one.equals("S")&&two.equals("P"))) 
			playerOne++;
		else if((two.equals("R")&&one.equals("S"))||(two.equals("P")&&one.equals("R"))||(two.equals("S")&&one.equals("P")))
			playerTwo++;
		}	
		if(playerOne==2) {
			System.out.println("Game over "+oneName+" wins!"); return;
		}else if(playerTwo==2) {
			System.out.println("Game over "+twoName+" wins!");return;
		}else {
			System.out.println("========\nRound "+2+":\n========");
			System.out.println("What does "+oneName+" play? (R, P, or S)"); String one = in.nextLine();
			System.out.println("What does "+twoName+" play? (R, P, or S)");	String two = in.nextLine();
		if((one.equals("R")&&two.equals("S"))||(one.equals("P")&&two.equals("R"))||(one.equals("S")&&two.equals("P"))) 
			playerOne++;
		else if((two.equals("R")&&one.equals("S"))||(two.equals("P")&&one.equals("R"))||(two.equals("S")&&one.equals("P")))
			playerTwo++;
		}	
		if(playerOne==2) {
			System.out.println("Game over "+oneName+" wins!"); return;
		}else if(playerTwo==2) {
			System.out.println("Game over "+twoName+" wins!");return;
		}else {
			System.out.println("========\nRound "+3+":\n========");
			System.out.println("What does "+oneName+" play? (R, P, or S)"); String one = in.nextLine();
			System.out.println("What does "+twoName+" play? (R, P, or S)");	String two = in.nextLine();
		if((one.equals("R")&&two.equals("S"))||(one.equals("P")&&two.equals("R"))||(one.equals("S")&&two.equals("P"))) 
			playerOne++;
		else if((two.equals("R")&&one.equals("S"))||(two.equals("P")&&one.equals("R"))||(two.equals("S")&&one.equals("P")))
			playerTwo++;
		}	
		
		if(playerOne==2) {
			System.out.println("Game over "+oneName+" wins!"); return;
		}else if(playerTwo==2) {
			System.out.println("Game over "+twoName+" wins!");return;
		}else {
			System.out.println("Game over: A tie between "+oneName+" and "+twoName);
		}
		
		in.close();
		
	}
}
