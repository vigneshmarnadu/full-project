package Revision;

public class College {
	private String name;
	private int noOfFloor;
	private int noOfDepartment;
	private boolean isTransport;
	private String location;
	private Student student;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfFloor() {
		return noOfFloor;
	}
	public void setNoOfFloor(int noOfFloor) {
		this.noOfFloor = noOfFloor;
	}
	public int getNoOfDepartment() {
		return noOfDepartment;
	}
	public void setNoOfDepartment(int noOfDepartment) {
		this.noOfDepartment = noOfDepartment;
	}
	public boolean getIsTransport() {
		return isTransport;
	}
	public void setIsTransport(boolean isTransport) {
		this.isTransport = isTransport;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public College(String name,int noOfFloor,int noOfDeparment,boolean isTranspot,String location,Student student) {
			
		this.name = name;
		this.noOfFloor = noOfFloor;
		this.noOfDepartment = noOfDepartment;
		this.isTransport = isTransport;
		this.location = location;
		this.student = student;
	}
	
	
	
	
	
	

}
