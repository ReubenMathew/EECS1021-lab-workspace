import java.util.Scanner;
public class RockPaperScissorsGame {
	
	static int playerOne = 0; static String oneName;
	static int playerTwo = 0; static String twoName;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the name of player 1:"); oneName = in.nextLine();
		System.out.println("Enter the name of player 2:"); twoName = in.nextLine();
		game(1);
		in.close();
	}
	public static void game(int n) {
		if(n==4)return;
		if(playerOne==2) {
			System.out.println("Game over "+oneName+" wins!"); return;
		}else if(playerTwo==2) {
			System.out.println("Game over "+twoName+" wins!");return;
		}else {
			System.out.println("========\nRound "+n+":\n========");
			System.out.println("What does "+oneName+" play? (R, P, or S)"); String one = in.nextLine();
			System.out.println("What does "+twoName+" play? (R, P, or S)");	String two = in.nextLine();
		if((one.equals("R")&&two.equals("S"))||(one.equals("P")&&two.equals("R"))||(one.equals("S")&&two.equals("P"))) 
			playerOne++;
		else if((two.equals("R")&&one.equals("S"))||(two.equals("P")&&one.equals("R"))||(two.equals("S")&&one.equals("P")))
			playerTwo++;
		game(n+1);
		}	
	}
}
