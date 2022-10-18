package Primitive;

public class CountLadder {
	public static void main(String[]args) {
		int[]nums= {-25,60,-54,30,80,-91,0,-5,-6};
		int count=0;
		int posi=0;
		int nega=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				System.out.println(nums[i]);
				posi++;
			}
			else if(nums[i]<0) {
				System.out.println(nums[i]);
				nega++;
			}
			else {
				System.out.println(nums[i]);
				count++;
			}
			
		}
		System.out.println("positive count ="+posi);
		System.out.println("Negative count ="+nega);
		System.out.println("Neutral="+count);
	}

}
