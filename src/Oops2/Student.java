package Oops2;

public class Student {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public Student (String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public String toString() {
		return name+" "+age;
	}

}
