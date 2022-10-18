package Oops2;

public class CollageStudent extends Student {
	private String collageName;
	private String location;
	private boolean isUniform;
	
	public void setCollageName(String collageName) {
		this.collageName=collageName;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setIsUniform(boolean isUniform) {
		this.isUniform=isUniform;
	}
	public boolean getIsUniform() {
		return isUniform;
	}
	public CollageStudent(String name,int age,String CollageName,String location,boolean isUniform) {
		super(name,age);
		this.collageName=collageName;
		this.location=location;
		this.isUniform=isUniform;
	}
	public String toString() {
		return super.toString()+" "+collageName+" "+location+" "+isUniform;
	}
	

}
