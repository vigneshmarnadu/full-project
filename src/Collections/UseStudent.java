package Collections;
import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
	ArrayList<Student>students=new ArrayList<>();
	Student s=new Student("Raja",12000,"Male");
	Student s1=new Student("Rani",20000,"female");
	Student s2=new Student("Roja",22000,"female");
	Student s3=new Student("Raju",32000,"Male");
	Student s4=new Student("Rohita",22000,"female");
	students.add(s);
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	for(Student e:students) {
		System.out.println(e);
	}
	System.out.println("***************");
	for(int i=0;i<students.size()-2;i++) {
		System.out.println(students.get(i));
	}
	students.forEach(x->
	{ if(x.getName().contains("R")) {
	System.out.println(x.getName());
	}});
	ArrayList <Student> femaleList=new ArrayList<>();
	
	for(Student y:students) {
		if(y.getGender().equalsIgnoreCase("female")) {
			femaleList.add(y);
		}
	}
	femaleList.forEach(x->System.out.println(x));
	
   

	
	}

}
