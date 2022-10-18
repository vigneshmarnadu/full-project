package Primitive;

public class UpperLower {
	public static void main(String[]args) {
		String []names= {"kihs","KIUDS","lojd","LOJD"};
		int upper=0;
		int lower=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(names[i].toUpperCase())) {
				System.out.println(names[i]);
				upper++;		
			}
			else {
				System.out.println(names[i]);
				lower++;
			}
		}
			System.out.println("Upper count="+upper);
			System.out.println("Lower count="+lower);
	
	}

}
