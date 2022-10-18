package Primitive;

public class Vowels {
	public static void main(String[]args) {
		String names[]= {"love","Kiss","Issue","Post","rtsd"};
		int count=0;
		int cons=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("o")||names[i].contains("u")){
				System.out.println(names[i]+"is Vowels");
				count++;
			}
			else {
				System.out.println(names[i]+"is consonants");
				cons++;
			}
		}
		System.out.println("Vowels count="+count);
		System.out.println("consonants count="+cons);
		}
	}


