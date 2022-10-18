package Primitive;

public class Plural {
	public static void main(String[]args) {
		String []names= {"names","kids","kigs","opus"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("s")) {
			System.out.println(names[i]);
			count++;
			}
		}
		System.out.println("count="+count);
	}

}
