package tests;

import model.Faculty;

public class FacultyTester {

	public static void main(String[] args) {
		Faculty f1 = new Faculty ("Jackie", "LAS2043", 70310);
		Faculty f2 = new Faculty ("Jonathan", "LAS2045", 70209);
		System.out.println("f1 and f2 store same: " + (f1 == f2));
		System.out.println(f1.getDescription());
		System.out.println(f2.getDescription());
		
		Faculty f3 = new Faculty("Jackie", "LAS2043", 70310);
		//Q1: Are f1 and f3 the same object?
		System.out.println("f1 and f3 are the same object: " + (f1 == f3));
		//Q2: Do f1 and f3 have the same contents (attribute values?)
		System.out.println("f1 and f3 have the same contents: " + f1.getDescription().contentEquals(f3.getDescription()));
		
		Faculty f4 = f1; //alasing
		//Q1: Are f1 and f4 the same object?
		System.out.println("f1 and f4 are the same object: " + (f1 == f4));
		//Q2: Do f1 and f4 have the same contents (attribute values?)
		System.out.println("f1 and f4 have the same contents: " + f1.getDescription().contentEquals(f4.getDescription()));
		
		/*
		 * Because f1 and f4 point to the same object,
		 * Using any of the names (f1 or f4) as the context object for a mutator method call
		 * will have the effect visible to all the names.
		 */
		
		f1.setName("Heeyeon");
		System.out.println("f1:");
		System.out.println(f1.getDescription());
		System.out.println("f4:");
		System.out.println(f4.getDescription());
	}

}
