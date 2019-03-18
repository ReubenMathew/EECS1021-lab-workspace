package model;

public class CourseRecord {
	String course;
	Faculty instruct;
	boolean hasInstr = false;

	public CourseRecord(String course) {
		this.course = course;
	}
	public void setInstructor(Faculty f) {
		instruct = f;
		hasInstr = true;
	}
	public String getDescription() {
		if(!hasInstr)
			return "Course "+course+" (raw marks: 0) has no instructor";
		else
			return "Course "+course+" (raw marks: 0) has instructor ("+instruct.getDescription()+")";
	}
}
