import java.util.*;
public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Enter an integer for seconds:");
		int seconds = Integer.parseInt(in.nextLine());
		int min = seconds/60;
		int sec = seconds%60;
		System.out.println(name+", your input "+seconds+" seconds can be divided into "+min+" minutes and "+sec+" seconds.");
		
		in.close();
	}

}
