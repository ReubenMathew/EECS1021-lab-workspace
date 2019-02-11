import java.util.Scanner;
public class MathSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("What kind of processing task would you like to preform?\n1: Generate an arithmetic sequence.\n2: Generate a geometric sequence.\n3: Determine an arithmetic sequence.");
			int ans = in.nextInt();
			if(ans==1) {
				System.out.println("Enter the first term in the arithmetic sequence:");
				int a1 = in.nextInt();
				System.out.println("Enter the common difference in the arithmetic sequence:");
				int d = in.nextInt();
				System.out.println("Enter the number of terms in the arithmetic sequence:");
				int n = in.nextInt(); in.nextLine();
			    System.out.print("<"+a1); int last = 0; int sum = a1;
				for(int i = 1; i < (n-1); i++) {
					last = a1+(i*d);
					System.out.print(", "+last);
					sum += last;
				}
				if(n!=1) {
					sum += last+d;
					System.out.print(", "+(last+d)+">\nSum of the arithmetic sequence: "+sum+"\n"); 
				}else {
					System.out.print(">\nSum of the arithmetic sequence: "+sum+"\n");
				}
			}else if(ans==2){
				System.out.println("Enter the first term in the geometric sequence:");
			    int first = in.nextInt();
			    System.out.println("Enter the common ratio in the geometric sequence");
			    int ratio = in.nextInt();
				System.out.println("Enter the number of terms in the geometric sequence:");
			    int numOfTerms = in.nextInt(); in.nextLine();
			    System.out.print("<"+first);
			    int foo = first; int sum = first;
			    for(int i = 0; i<numOfTerms-2; i++){
			    	foo *= ratio; sum += foo;
			    	System.out.print(", "+foo);
			    }
				if(numOfTerms!=1) {
					sum += foo*ratio; 
				    System.out.print(", "+(foo*ratio)+">\nSum of the geometric sequence: "+sum+"\n");
				}else {
					System.out.print(">\n Sum of the geometric sequence: "+sum+"\n");
				} 				
			}else if(ans==3) {
				int[] foo = new int[10]; int len = 1; boolean quz = true;
				for(int i = 0; i < foo.length; i++) {
					System.out.println("Enter a new number:");
					foo[i] = in.nextInt();
					if(i == foo.length-1) { 
						System.out.println("You have entered the maximum number of numbers!\n"+"We will start processing your sequence right away.");
						break;
					}
					System.out.println("You have entered "+(i+1)+" numbers. \nYou may still enter another " +(9-i)+" numbers. \nWould you like to enter another new number (Y/N)");
					in.nextLine(); String ans2 = in.nextLine();
					if(ans2.equals("N")&&(i==0)) { 
						System.out.println("Error: we cannot infer the common difference from a sequence of size one."); 
						quz = false; break;
					}else if(ans2.equals("N")) {
						break;
					}len++;
				} int[] bar = new int[len];  int baz = foo[1]-foo[0];
				for(int i = 0; i < bar.length; i++) bar[i]=foo[i]; int sum = 0; 
				for(int i = 1; i < bar.length; i++) {
					 if(bar[i]-bar[i-1]!=baz) {
							System.out.print("<"); for(int j = 0; j<bar.length-1; j++) System.out.print(bar[j]+", "); System.out.print(bar[bar.length-1]+">");
System.out.println(" is not an arithmetic sequence");
						 quz = false; break; 
					 }sum += bar[i-1];
				}sum+=bar[bar.length-1];
				if(quz) {
					System.out.print("<"); for(int i = 0; i<bar.length-1; i++) System.out.print(bar[i]+", "); System.out.print(bar[bar.length-1]+">");
					System.out.println(" is an arithmetic sequence with\nfirst term "+bar[0]+", common difference "+baz+", length "+bar.length+", and sum "+sum);
				}
			}else {
				System.out.println("Error: task number must be 1, 2, or 3."); continue;
			}
		    System.out.println("Would you like to process another sequence? (Y/N)");
			String ans1 = in.nextLine();
			if(ans1.equals("N")) {
			    System.out.println("Bye!");
		    	break;
		    }
		}
	}
}
