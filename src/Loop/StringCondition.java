package Loop;

public class StringCondition {
	public static void main(String[]args) {
		String value="Onesoft";
		String word="";
		for(int i=value.length()-1;i>=0;i--) {
			word=word+value.charAt(i);
		}
		System.out.println(word);
	}

}
