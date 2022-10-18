package Primitive;

public class InbetweenLetter {
	public static void main(String[]args) {
		String names[]= {"noid","jiuy","kidd","lodf"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].substring(1,names[i].length()-1));
		}
	}

}
