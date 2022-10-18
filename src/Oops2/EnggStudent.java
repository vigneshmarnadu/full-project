package Oops2;

public class EnggStudent extends CollageStudent{
	private int id;
	private String dept;
	private String year;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setYear(String year) {
		this.year=year;
	}
	public String getYear() {
		return year;
	}
	public EnggStudent (String name,int age,String collageName,String location,boolean isUniform,int id,String dept,String year) {
		super(name,age,collageName,location,isUniform);
		this.id=id;
		this.dept=dept;
		this.year=year;
	}
	public String toString() {
		return super.toString()+" "+id+" "+dept+" "+year;
	}

}
