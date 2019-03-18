package model;

public class StudentManagementSystem {
	
	Student[] students = new Student[100];
	int count = 0;
	public StudentManagementSystem() {
	}

	public String getDescription() {
		String msg = "";
		if(count == 0) {
			msg += "Student management system currently stores no students.\n";
		} else {
			msg += "Student management system currently stores "+this.count+" students.";
			for(int i = 0; i < count; i++)
				msg += "\n"+students[i].getDescription();
		}
		return msg;
	}

	public Student[] getStudents() {
		Student[] foo = new Student[count];
		for(int i = 0; i < foo.length; i++) foo[i] = students[i];
		return foo;
	}

	public void addStudent(Student s1) {
		students[count] = s1;
		count++;
	}
	
	public void addStudent(String string) {
		Student foo = new Student(string);
		students[count] = foo;
		count++;
	}
	
	public double getGPA(String string) {
		for(int i = 0; i <count; i++)
			if(students[i].name.equals(string))
				return students[i].getGPA();
		return 0;
		
	}

	public void addCourse(String string, CourseRecord cr) {
		for(int i = 0; i <count; i++)
			if(students[i].name.equals(string))
				students[i].addCourse(cr);
	}
	public int getMarks(String name, String course) {
		for(int i = 0; i <count; i++)
			if(students[i].name.equals(name))
				for(int j = 0; j < students[i].count; j++)
					if(students[i].courses[j].course.equals(course))
						return students[i].courses[j].getMarks();
		return -1;
	}	

	public void setMarks(String name, String course, int mark) {
		for(int i = 0; i <count; i++)
			if(students[i].name.equals(name))
				for(int j = 0; j < students[i].count; j++)
					if(students[i].courses[j].course.equals(course))
						 students[i].courses[j].setMarks(mark);
	}

	
	
}
