package Loop;

public class Fibbonacci {
	public static void main(String[]args) {
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<=10;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
