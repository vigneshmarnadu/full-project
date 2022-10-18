package Oops1;

public class Employee {
	private String name;
	private int salary;
	private int id;
	private String department;
	
	public void SetName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
		
	}
	public int getsalary() {
		return salary;
	}
	public void Setid(int id) {
		this.id=id;
		
	}
	public int getid() {
		return id;
	}
	public void SetDepartment(String department) {
		this.department=department;
		
	}
	public String getdepartment() {
		return department;
	}
	
	public Employee (String name,int salary,int id,String department) {
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.department=department;
	}
	public String toString() {
		return name+" "+salary+" "+id+" "+department;
	}
	

}
