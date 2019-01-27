import java.util.*;
public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = in.nextLine();
		System.out.println(name+", enter your height in inches:");
		double heightI = Double.parseDouble(in.nextLine());
		System.out.println(name+", enter your weight in pounds:");
		double weightP = Double.parseDouble(in.nextLine());
		double height =  heightI / 39.37; double weight = weightP / 2.205;
		System.out.println(height+","+weight);
		double bmi = weight/Math.pow(height, 2);
		System.out.println(name+ ", your BMI is " +bmi); System.out.print("You are ");
		if(bmi < 18.5)
			System.out.print("underweight!");
		else if((bmi < 25.0)&&(bmi >= 18.5))
			System.out.print("normal!");
		else if((bmi < 30.0)&&(bmi >= 25.0))
			System.out.print("overweight!");
		else if(bmi >= 30.0)
			System.out.print("obese!");
		in.close();
	}
}
