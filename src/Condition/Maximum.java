package Condition;

public class Maximum {
	public static void main (String[]args) {
		String a="vignesh";
		if(a.length()>4) {
			System.out.println(a.charAt(0));
		}
		else {
			System.out.println(a.charAt(a.length()-1));
		}
	}

}
