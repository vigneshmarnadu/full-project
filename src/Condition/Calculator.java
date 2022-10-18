package Condition;

public class Calculator {
	public static void main (String[]args) {
		int num1=10;
		int num2=15;
		String cal="Addition";
		switch(cal) {
		case "Subraction":
			System.out.println(num1-num2);
			break;
		case "Division":
			System.out.println(num1/num2);
			break;
		case "Addition":
			System.out.println(num1+num2);
			break;
		case "Mulitiplication":
			System.out.println(num1*num2);
		case "Modulus":
			System.out.println(num1%num2);
			default:
				System.out.println("Invalid Input");
		     
		}
	}

}
