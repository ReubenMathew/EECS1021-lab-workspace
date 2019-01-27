import java.util.*;
public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double inc,tax1,tax2,tax3;
		System.out.println("Enter your name:");
		String name = in.nextLine();
		System.out.println(name+", enter your filing status (1 - Single Filing; 2 - Married Filing):");
		int status = in.nextInt(); 
		if(status==1) {
			System.out.println(name+", enter your taxable income");
			inc = in.nextDouble();
			boolean one = (inc-8350)>=0?false:true;
			tax1 = one?inc*.1:8350*.1;
			boolean two = ((inc>=8351))?true:false;
			tax2 = two?(inc-8350)*.15:0;
			boolean three = ((inc>=33950))?true:false;
			tax2 = three?(33950-8350)*.15:tax2;
			tax3 = three?(inc-33950)*.25:0;
			System.out.println(name+", you should pay $"+(tax1+tax2+tax3));
			System.out.println("Calculation is based on the scheme of Single Filing:");
			if(tax1!=0)System.out.println("Part I: $"+tax1);
			if(tax2!=0)System.out.println("Part II: $"+tax2);
			if(tax3!=0)System.out.println("Part III: $"+tax3);
		}else if(status==2) {
			System.out.println(name+", enter your taxable income");
			inc = in.nextDouble();
			boolean one = (inc-16700)>=0?false:true;
			tax1 = one?inc*.1:16700*.1;
			boolean two = ((inc>=16701))?true:false;
			tax2 = two?(inc-16701)*.15:0;
			boolean three = ((inc>=67900))?true:false;
			tax2 = three?(67900-16700)*.15:tax2;
			tax3 = three?(inc-67900)*.25:0;
			System.out.println(name+", you should pay $"+(tax1+tax2+tax3));
			System.out.println("Calculation is based on the scheme of Married Filing:");
			if(tax1!=0)System.out.println("Part I: $"+tax1);
			if(tax2!=0)System.out.println("Part II: $"+tax2);
			if(tax3!=0)System.out.println("Part III: $"+tax3);
		}else {
			System.out.println("Illegal status: "+status);
		}	
		in.close();
	}
}
