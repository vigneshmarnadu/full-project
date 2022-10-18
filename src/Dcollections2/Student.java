package Dcollections2;

public class Student {
	String name;
	int id;
	String branch;
	int marks;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	public Student(String name,int id,String branch,int marks) {
		this.name=name;
		this.id=id;
		this.branch=branch;
		this.marks=marks;
	}
	public String toString() {
		return "Name:"+name+" "+"Id:"+id+" "+"Branch:"+branch+" "+"Marks:"+marks;
	}

}
