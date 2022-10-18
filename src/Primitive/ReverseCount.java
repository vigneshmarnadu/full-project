package Primitive;

public class ReverseCount {
	public static void main(String[]args) {
		boolean [] eligible= {true,false,true,false,true,true};
		int count=0;
		for(int i=eligible.length-1;i>=0;i--) {
			System.out.println(eligible[i]);
			count++;
		}
		System.out.println("Count ="+count);
	}

}
