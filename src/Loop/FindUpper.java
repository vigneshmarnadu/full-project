package Loop;

public class FindUpper {
	public static void main(String[]args) {
		String value="LeNoVO";
		String temp=value.toUpperCase();
		int lCount=0;
		int uCount=0;
		for(int i=0;i<value.length();i++) {
			if(value.charAt(i)==temp.charAt(i)) {
				uCount++;
			}
			else {
				lCount++;
			}
		}
		System.out.println(lCount);
		System.out.println(uCount);
	}

}
