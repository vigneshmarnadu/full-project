package Revision;

public class Test {
	public static void main(String[]args) {
		for(int i=1;i<=12;i++) {
			if(i==5||i==9||i==10) {
				continue;
			}
			else if(i==12) {
				System.out.println(i);
				break;
				
				}
			System.out.println(i);
			
		}
	}

}
