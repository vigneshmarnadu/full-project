package Loop;

public class PrintAverage {
	public static void  main(String[]args) {
		int total=0;
		int count=0;
		for(int i=0;i<=1000;i++) {
			total=total+i;
			count=count+1;
		}
		System.out.println(total);
		System.out.println(count);
		System.out.println(total/count);
	}

}
