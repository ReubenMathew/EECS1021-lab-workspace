package tests;

import model.CourseRecord;
import model.Faculty;
import model.Student;

public class StudentTester2 {

	public static void main(String[] args) {
		
		Faculty f1 = new Faculty("Jonathan", "LAS2045", 70139);
		Faculty f2 = new Faculty("Jackie", "LAS2043", 70130);
		
		CourseRecord cr1 = new CourseRecord("2030");
		CourseRecord cr2 = new CourseRecord("1021");
		CourseRecord cr3 = new CourseRecord("3311");
		
		Student s1 = new Student("SunHye"); //objects being created here
		Student s2 = new Student("JiHye");
		
		// Link from course objects to faculty objects
		cr1.setInstructor(f2);
		cr2.setInstructor(f2);
		cr3.setInstructor(f1);
		
		// Link from student objects to course record objects
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s2.addCourse(cr2);
		s2.addCourse(cr3);
		
		System.out.println(s1.courses[0] == s2.courses[1]); //FALSE
		System.out.println(s1.courses[1] == s2.courses[0]); //TRUE
		System.out.println(s1.courses[2] == s2.courses[2]); //TRUE
		System.out.println(s1.courses[0].instruct == s2.courses[1].instruct); //TRUE
//		
//		The code below is Student tester 1, the code above is student tester 2.
//		Student s1 = new Student("Heeyeon");
//		System.out.println("=== after creating s1");
//		System.out.println(s1.getDescription());
//		s1.addCourse(cr1);
//		System.out.println("=== after adding cr1 to s1.courses");
//		System.out.println(s1.getDescription());
//		s1.addCourse(cr2);
//		System.out.println("=== after adding cr2 to s1.courses");
//		System.out.println(s1.getDescription());
//		s1.addCourse(cr3);
//		System.out.println("=== after adding cr3 to s1.courses");
//		System.out.println(s1.getDescription());
		
	}

}
