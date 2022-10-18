package Primitive;

public class MaxiString {
	public static void main(String[]args) {
		String[] words= {"viji","Surya","suresh","Preethi","sum"};
		int temp=0;
		String temp1="";
		int ter=words[0].length();
		String temp2="";
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>temp) {
				temp=words[i].length();
				temp1=words[i];
				}
			
			else if (words[i].length()<ter) {
				ter=words[i].length();
				temp2=words[i];
				}
			else {
				continue;
			}
				
			}
		System.out.println(temp1);
		System.out.println(temp2);
		}
		
	}


