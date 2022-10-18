package Lms;

public class Test5 {
	public static void main(String[]args) {
		String name= args[0];
		String[] name1=name.split(",");
		int num1=Integer.parseInt(name1[1]);
		System.out.println(name1[0]);
		System.out.println(num1);
		System.out.println(name1[2]);
		
	}

}
