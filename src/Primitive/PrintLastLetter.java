package Primitive;

public class PrintLastLetter {
	public static void main(String[]args) {
		String [] names= {"last","kisko","lost","jius","nmay"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].charAt(names[i].length()-1));
		}
	}

}
