package Revision;

public class Test2 {
	public static void main(String[]args) {
		int [] nums = {10,35,12,13,16,92};
		int num=0;
		int[] evenNumber=new int [nums.length];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				evenNumber[num]=nums[i];
				num++;
			}
		}
	}

}
