package Primitive;

public class ReverseLetter {
	public static void main(String[]args) {
		String names[]= {"Ghui","loyeb","Loutr","Lout"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("L")) {
			System.out.println(names[i]);
			count++;
			}
		}
		System.out.println("count="+count);
	}
	}


