import java.util.*;
public class GradeReport {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int quiz[] = new int[9];
		int ass[] = new int[10];
		int lab[] = new int [3];
		double fin = 0;
		System.out.println("What is your name?");
		String name = in.nextLine();
		for(int i=0; i<9;i++) {System.out.println(name+", what is your score for Quiz "+i+" (out of 100)?"); quiz[i]=in.nextInt();}
		for(int i=0; i<10;i++) {System.out.println(name+", what is your score for Assignment "+i+" (out of 100)?"); ass[i]=in.nextInt();}
		for(int i=0; i<3;i++) {System.out.println(name+", what is your score for Lab Test "+i+" (out of 100)?"); lab[i]=in.nextInt();}
		int midterm = in.nextInt();
		int exam = in.nextInt(); in.nextLine();
		String course = in.nextLine();
		System.out.println(name +", here is your grading report for "+course);
		System.out.println("-----------------------------------------");
		for(int i=0; i<9;i++) System.out.println("Quiz "+i+": "+ quiz[i]);
		System.out.println("-----------------------------------------");
		for(int i=0; i<10;i++) System.out.println("Assignment "+i+": "+ ass[i]);
		System.out.println("-----------------------------------------");
		for(int i=0; i<3;i++) System.out.println("Lab Test "+i+": "+ lab[i]);
		System.out.println("-----------------------------------------");
		System.out.println("Midterm Test: "+midterm);
		System.out.println("Final Exam "+exam);
		System.out.println("-----------------------------------------");
		System.out.println("Average of quizzes: "+ 1.0*avg(quiz));
		System.out.println("Average of assignments: "+ 1.0*avg(ass));
		System.out.println("Average of lab tests: "+ 1.0*avg(lab));
		for(int x: quiz) fin += 0.02*x;for(int x: ass) fin += 0.02*x;for(int x: lab) fin += 0.04*x;
		fin += midterm*.15 + exam*.35; fin = fin*1.0;
		System.out.println("Final raw marks: "+fin);
		
		
	}
	public static double avg(int[] data) {
		int sum = 0;
		for (int d : data) sum += d;
		double average = 1.0d * sum / data.length;
		return average;
		}
}

