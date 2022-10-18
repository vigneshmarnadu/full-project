package Primitive;

public class Maxi {
	public static void main(String[]args) {
		int []nums= {51,32,100,5,80,70,91};
		int temp=nums[0];
		int mini=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>temp) {
				temp=nums[i];
			}
			else if (nums[i]<mini) {
				mini=nums[i];
				
			}
			else {
				continue;
			}
		}
		System.out.println("Maximum no ="+temp);
		System.out.println("Minimum no ="+mini);
	}
}


