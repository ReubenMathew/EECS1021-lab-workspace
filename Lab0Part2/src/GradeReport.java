import java.util.*;
public class GradeReport {	
	public static int quiz[] = new int[9];
	public static int ass[] = new int[10];
	public static int lab[] = new int [3];
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		double fin;
		System.out.println("What is your name?");
		String name = in.nextLine();
		assign(name,"Quiz",quiz,0);
		assign(name,"Assignment",ass,0);
		assign(name,"Lab Test",lab,0);
		System.out.println(name+" what is your midterm score (out of 100)?");
		int midterm = in.nextInt();
		System.out.println(name+" what is your final exam score (out of 100)?");
		int exam = in.nextInt(); in.nextLine();
		System.out.println(name+" which course are you talking about?");
		String course = in.nextLine();
		System.out.println(name +", here is your grading report for "+course);
		System.out.println("-----------------------------------------");
		testPrint("Quiz",quiz,0);
		System.out.println("-----------------------------------------");
		testPrint("Assignment",ass,0);
		System.out.println("-----------------------------------------");
		testPrint("Lab Test",lab,0);
		System.out.println("-----------------------------------------");
		System.out.println("Midterm Test: "+midterm);
		System.out.println("Final Exam "+exam);
		System.out.println("-----------------------------------------");
		System.out.println("Average of quizzes: "+ 1.0*avg(quiz));
		System.out.println("Average of assignments: "+ 1.0*avg(ass));
		System.out.println("Average of lab tests: "+ 1.0*avg(lab));
		fin = weighted(quiz,0.02,0)+weighted(ass,0.02,0)+weighted(lab,0.04,0);
		fin += midterm*.15 + exam*.35; fin = fin*1.0;
		System.out.println("Final raw marks: "+fin);
		in.close();
	}
	public static double weighted(int[] arr,double perc,int n) {
		if (n==arr.length)
			return 0;
		return arr[n]*perc + weighted(arr,perc,n+1);
	}
	public static double avg(int[] array) {
	    int sum = Arrays.stream(array).sum();
	    return (double) sum / array.length;
	}
	public static void assign(String name,String arrName,int arr[], int n) {
		if (n==arr.length)
			return;
		System.out.println(name+", what is your score for "+arrName+" "+(n+1)+" (out of 100)?");
		if(arrName.equals("Quiz")) quiz[n]=in.nextInt();
		else if(arrName.equals("Assignment")) ass[n] = in.nextInt();
		else if(arrName.equals("Lab Test"))	lab[n] = in.nextInt();
		assign(name,arrName,arr,n+1);
	}
	public static void testPrint(String arrName,int arr[], int n) {
		if (n==arr.length)
			return;
		System.out.println(arrName+" "+(n+1)+": "+ arr[n]);
		testPrint(arrName, arr,n+1);
	}
}