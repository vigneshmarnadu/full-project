package Dcollections2;

public class UseEmployee {
	public static void main(String []args) {
		Employee e1=new Employee("Vignesh",27,30000);
		Employee e2=new Employee("Vinoth",23,20000);
		Employee e3=new Employee("Nithis",30,35000);
		
		ArrayList<Employee>e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
	
	}

}
