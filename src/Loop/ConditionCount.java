package Loop;

public class ConditionCount {
	public static void main(String[]args) {
		int oddNum=0;
		int evenNum=0;
		for(int  i=200;i<=400;i++) {
			if(i%2==0) {
				evenNum++;
			}
			else {
				oddNum++;
			}
		}
			System.out.println(evenNum);
			System.out.println(oddNum);
		
		
	}

}
