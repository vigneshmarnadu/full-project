package Primitive;

public class EvenOddCount {
	public static void main(String[]args) {
		int nums[]= {10,11,15,16,18,21,24,54};
		int even=0;
		int odd=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]+" is even");
				even++;
			}
			else {
				System.out.println(nums[i]+" is odd");
				odd++;
			}
		}
		System.out.println("Even count="+even+"Odd Count="+odd);
	}

}
