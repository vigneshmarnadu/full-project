package Condition;

public class FindElder {
	public static void main (String[]args) {
		int age1=35;
		int age2=27;
		int age3=36;
		int age4=12;
		if(age1>age2&&age1>age3&&age1>age4) {
			System.out.println("Age1 is Elder");
		}
		else if(age2>age1&&age2>age3&&age2>age4) {
			System.out.println("Age2 is Elder");
		}
		else if (age3>age1&&age3>age2&&age3>age4) {
			System.out.println("Age3 is Elder");
		}
		else if (age4>age1&&age4>age2&&age4>age3) {
			System.out.println("Age4 is Elder");
		}
		else {
			System.out.println("Not Valid");
		}
	}

}
