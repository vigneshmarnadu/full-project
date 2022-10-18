package Loop;

public class FindPrime {
	public static void main(String[]args) {
		int num=97;
		boolean isPrime=true;//int a=0
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;//int a=1
			}
			
		}
		if(isPrime==true) { //a==0
			System.out.println("Its a Prime Number");
		}
		else {
			System.out.println("Its not a Prime Number");
			
		}
	}

}
