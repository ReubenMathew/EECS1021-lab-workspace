package model;

public class Faculty {
	public String name,room;
	public int ext;
	
	public Faculty(String name, String room, int ext) {
		this.name = name;
		this.room = room;
		this.ext = ext;
	}
	
	public String getDescription() {
		return "Faculty " +name+ " has campus address " +room+ " and phone extension "+ext;
	}

	public void setName(String string) {
		this.name = string;	
	}
	
}
