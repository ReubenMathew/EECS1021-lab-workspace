package model;

public class CourseRecord {
	public String course;
	public String title;
	public Faculty instruct;
	public int marks;
	boolean hasInstr = false;

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getLetterGrade() {
		String g = "";
		if (this.marks >= 90)
			g = "A+";
		else if (this.marks >= 80) 
			g = "A";
		else if (this.marks >= 70) 
			g = "B";
		else if (this.marks >= 60) 
			g = "C";
		else if (this.marks >= 50) 
			g = "D";
		else 
			g = "F";
		return g;
	}
	public int getMarks() {
		return marks;
	}
	public CourseRecord(String course) {
		this.course = course;
	}
	public CourseRecord() {
		
	}
	public Faculty getInstructor() {
		return instruct;
	}
	public CourseRecord(String course, int mark) {
		this.course = course;
		setMarks(mark);
	}
	public void setInstructor(Faculty f) {
		instruct = f;
		hasInstr = true;
	}
	public String getDescription() {
		if(!hasInstr)
			return "Course "+course+" (raw marks: 0) has no instructor";
		else
			return "Course "+course+" (raw marks: "+marks+" and letter grade "+getLetterGrade()+") has instructor ("+instruct.getDescription()+")";
	}
	public void setTitle(String string) {
		this.title = string;		
	}
}
