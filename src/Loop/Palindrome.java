package Loop;

public class Palindrome {
	public static void main(String[]args) {
		String value="Radar";
		String word="";
		for (int i=value.length()-1;i>=0;i--) {
			word=word+value.charAt(i);
		}
		if(value.equalsIgnoreCase(word)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its a not Palindrome");
		}
	}

}
