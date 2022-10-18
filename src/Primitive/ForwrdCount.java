package Primitive;

public class ForwrdCount {
	public static void main(String[]args) {
		float [] sqft= {10.5f,2.6f,7.8f,4.7f,3.8f};
	     int count=0;
		for(int i=0;i<sqft.length;i++) {
			System.out.println(sqft[i]);
			count++;
		}
		System.out.println("Count ="+count);
	}

}
