package tests;

import model.CourseRecord;

import model.Student;

public class StudentTester4 {

	public static void main(String[] args) {

		CourseRecord cr1 = new CourseRecord("2030");
		CourseRecord cr2 = new CourseRecord("1021");
		CourseRecord cr3 = new CourseRecord("3311");
		
		Student s1 = new Student("SunHye"); //objects being created here
		Student s2 = new Student("JiHye");
	
		// Link from student objects to course record objects
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s2.addCourse(cr2);
		s2.addCourse(cr3);
		
		System.out.println(s1.name + " has marks for 2030: " + s1.getMarks("2030"));
		System.out.println(s1.name + " has marks for 1021: " + s1.getMarks("1021"));
		System.out.println(s1.name + " has marks for 3311: " + s1.getMarks("3311"));
		s1.setMarks("2030", 60);
		s1.setMarks("1021", 90);
		System.out.println("After setting 2030 and 1021 marks... ");
		System.out.println(s1.name + " has marks for 2030: " + s1.getMarks("2030"));
		System.out.println(s1.name + " has marks for 1021: " + s1.getMarks("1021"));
	}

}
