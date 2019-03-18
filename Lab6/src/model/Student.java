package model;

public class Student {
	
	public String name;
	public int count = 0;
	public double gpa = -600;
	boolean hasCourse = false;
	public CourseRecord[] courses = new CourseRecord[100];
	
	public double getGPA() {
		double num=0.0;
		for(int i=0;i<count;i++) {
			String letter=this.courses[i].getLetterGrade();
			if(letter.equals("A+")) {
				num=num+9;
			}else if(letter.equals("A")) {
				num=num+8;
			}else if(letter.equals("B")) {
				num=num+7;
			}else if(letter.equals("C")) {
				num=num+6;
			}else if(letter.equals("D")) {
				num=num+5;
			}else  {
				num=num+0;
			}
		}
		return (count ==0)?0:num/count;
	}
	public Student(String name) {
		this.name = name;
	}

	public String getDescription() {
		String foo = "Student "+name+" has registered "+count+" courses (with GPA "+getGPA()+"):";		
		for(int i = 0; i  < count; i++)
			foo += "\n"+courses[i].getDescription();
		return foo;
	}

	public void addCourse(CourseRecord course) {
		this.courses[count] = course;
		count++;
	}
	public void addCourse(String string) {
		CourseRecord foo = new CourseRecord(string);
		addCourse(foo);
	}
	public void setMarks(String course, int mark) {
		for(int i = 0; i < count; i++)
			if(courses[i].course.equals(course))
				courses[i].setMarks(mark);
	}
	public int getMarks(String course) {
		for(int i = 0; i < count; i++)
			if(courses[i].course.equals(course))
				return courses[i].getMarks();
		return 0;
	}


}
