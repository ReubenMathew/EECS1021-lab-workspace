package model;

public class Faculty {
	String name,room;
	int ext;
	
	public Faculty(String name, String room, int ext) {
		this.name = name;
		this.room = room;
		this.ext = ext;
	}
	
	public String getDescription() {
		return "Faculty " +name+ " has campus address " +room+ " and phone extension "+ext;
	}
	
}
