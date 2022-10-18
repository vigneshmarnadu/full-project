package Oops1;

public class Company {
	String name;
	String location;
	int noOfFloors;
	Employee employee;
	
	public void SetName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void SetLocation(String location) {
		this.location=location;
		
	}
	public String getLocation() {
		return location;
	}
	public void SetnoOfFloors(int noOfFloors) {
		this.noOfFloors=noOfFloors;
		
	}
	public int getnoOfFloors() {
		return noOfFloors;
	}
	public void SetEmployee(Employee employee) {
		this.employee=employee;
		
	}
	public Employee getemployee() {
		return employee;
	}
	
	public Company (String name,String location,int noOfFloors,Employee employee) {
		this.name=name;
		this.location=location;
		this.noOfFloors=noOfFloors;
		this.employee=employee;
	}
	public String toString() {
		return name+" "+location+" "+noOfFloors+" "+employee;
	}

}
