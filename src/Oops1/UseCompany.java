package Oops1;

public class UseCompany {
	public static void main(String[]args) {
		Employee em=new Employee("vikas",20000,1243,"Weaving");
		Company com=new Company("BABU","Chennai",8,em);
		System.out.println(com);
	}

}
