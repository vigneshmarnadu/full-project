package Oops1;

public class UseDepartment {
	public static void main(String[]args) {
		Student student=new Student();
		student.setName("MATHI");
		student.setRollNo(1234);
		student.setIsMale(false);
		
		Department dept=new Department();
		dept.setName("MATHS");
		dept.setCode(123);
		dept.setIsManual(true);
		dept.setStudent(student);
		
		System.out.println(dept.getName());
		System.out.println(dept.getCode());
		System.out.println(dept.getStudent().getRollNo());
		
		System.out.println(dept.getStudent().getName());
		
	}

}
